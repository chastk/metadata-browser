package controllers;

import http.GetSolrQuery;
import http.JsonHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import models.FacetsWithCategories;
import models.SparqlQuery;
import models.SparqlQueryResults;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.FacetFormData;
import views.html.hierarchy_faceting;


public class Hierarchy extends Controller {

    public static FacetFormData facet_form = new FacetFormData();
    public static FacetsWithCategories field_facets = new FacetsWithCategories();
    public static FacetsWithCategories query_facets = new FacetsWithCategories();
    public static FacetsWithCategories pivot_facets = new FacetsWithCategories();
    public static FacetsWithCategories range_facets = new FacetsWithCategories();
    public static FacetsWithCategories cluster_facets = new FacetsWithCategories();
    public static Map<String, Boolean> named_location = new HashMap<String, Boolean>();
    public static Map<String, Boolean> spatial_predicate = new HashMap<String, Boolean>();
    public static SparqlQueryResults query_results = new SparqlQueryResults();
    
    public static void getFacets(JsonHandler jh){
    	//Get the facets
        try {
            if (jh.getFieldCountJson()) {
                for (String key : jh.categories_and_facets.keySet()) {
                    for (String facet : jh.categories_and_facets.get(key)){
                        //HashMap<String, String> temp_map = new HashMap<String, String>();
                        //temp_map.put(facet, jh.categories_facets_and_counts.get(key).get(facet));
                        if (facet.equals("null")) {field_facets.addFacet(key, "missing"); continue;}
                        field_facets.addFacet(key, facet);
                    }
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    // for /metadata HTTP GET requests
    public static Result index() {
    	Form<FacetFormData> formData = Form.form(FacetFormData.class).fill(facet_form);
        JsonHandler jh = new JsonHandler();
        //ArrayList<String> names = new ArrayList<String>();
        
        //Get query using http.GetSolrQuery
        SparqlQuery query = new SparqlQuery();
        GetSolrQuery query_submit = new GetSolrQuery(query);
        TreeMap<String, SparqlQueryResults> query_results_list = new TreeMap<String, SparqlQueryResults>();
    	String final_query = null;
    	
    	for (String collection : query_submit.list_of_queries.keySet()){
    		final_query = query_submit.list_of_queries.get(collection).toString();
    		String query_json = null;
            try {
    			query_json = query_submit.executeQuery(collection);
    		} catch (IllegalStateException | IOException e1) {
    			e1.printStackTrace();
    		}
            SparqlQueryResults query_results = new SparqlQueryResults(query_json);
            query_results_list.put(collection, query_results);
    	}
        
        
        //Get the facets
        getFacets(jh);
  
        //System.out.println();
        
    // TODO: fix this (probably in a scala.html file for handling SPARQL results)
        System.out.println("hierarchy postIndex() was called!");
        return ok(hierarchy_faceting.render(formData, field_facets, query_facets,
                    range_facets, pivot_facets, cluster_facets, 
                    formData.get().subject, formData.get().predicate, query_results_list, "All Documents"));
        
    }// /index()


    // for /metadata HTTP POST requests
    public static Result postIndex() {
        
    	JsonHandler jh = new JsonHandler();
    	String subject = new String();
    	String predicate = "rdfs:subclassOf";
    	DynamicForm formData = Form.form().bindFromRequest();
    	
    	FacetsWithCategories field_facet_for_query = new FacetsWithCategories();
    	
    	//Searching for the index of "[" is done here, because of the way the views are set up
    	//The scala will add a number to each category so as to map
    	//The same category to more than 1 facet
    	//When creating the query, however, this number is not needed.
    	for (String category : formData.data().keySet()){
    		if (category.contains("[")) {
    			int index = category.indexOf("[");
    			field_facet_for_query.addFacet(category.substring(0,index), formData.data().get(category));
    		} else {
    			subject = formData.data().get(category);
    		}
    	}
    	
    	SparqlQuery query = new SparqlQuery(subject, predicate, field_facet_for_query, query_facets,
			    pivot_facets, range_facets, cluster_facets);

    	GetSolrQuery query_submit = new GetSolrQuery(query);

    	//TODO loop over all queries in query_submit.list_of_queries
    	TreeMap<String, SparqlQueryResults> query_results_list = new TreeMap<String, SparqlQueryResults>();
    	String final_query = null;

    	for (String collection : query_submit.list_of_queries.keySet()){
    			final_query = query_submit.list_of_queries.get(collection).toString();
    			String query_json = null;
    			try {
    				query_json = query_submit.executeQuery(collection);
    			} catch (IllegalStateException | IOException e1) {
    				e1.printStackTrace();
    			}
    			SparqlQueryResults query_results = new SparqlQueryResults(query_json);
    			query_results_list.put(collection, query_results);
    	}
    	
        //Get the facets
        getFacets(jh);
        
        //return ok("cool");
        // TODO: fix this, too
        Form<FacetFormData> fd = Form.form(FacetFormData.class).fill(facet_form);
        System.out.println("hierarchy postIndex() was called!");
        return ok(hierarchy_faceting.render(fd, field_facets, query_facets,
                range_facets, pivot_facets, cluster_facets, 
                subject, predicate, query_results_list, final_query));
    }// /postIndex()

}
