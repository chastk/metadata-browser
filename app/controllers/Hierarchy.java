package controllers;

import http.GetSparqlQuery;
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

    public static SparqlQueryResults query_results = new SparqlQueryResults();
    
    // for /metadata HTTP GET requests
    public static Result index() {
    	//Form<FacetFormData> formData = Form.form(FacetFormData.class).fill(facet_form);
        JsonHandler jh = new JsonHandler();
        
        //Get query using http.GetSparqlQuery
        SparqlQuery query = new SparqlQuery();
        GetSparqlQuery query_submit = new GetSparqlQuery(query);
        // query_submit contains 7 queries: one for each thingType right now
        TreeMap<String, SparqlQueryResults> query_results_list = new TreeMap<String, SparqlQueryResults>();
    	String final_query = null;
        for (String tabName : query_submit.thingTypes){
            //System.out.println("index(): " + tabName);
    	    final_query = query_submit.collection.toString();
    	    String query_json = null;
            try {
    		    query_json = query_submit.executeQuery(tabName);
    	    } catch (IllegalStateException | IOException e1) {
        		e1.printStackTrace();
        	}
            SparqlQueryResults query_results = new SparqlQueryResults(query_json, tabName);
            query_results_list.put(tabName, query_results);
        }// /for tabname in types of entities
        
        //Get the facets
        //getFacets(jh);

        System.out.println("hierarchy index() was called!");
        return ok(hierarchy_faceting.render(query_results_list, final_query));
        
    }// /index()


    // for /metadata HTTP POST requests
    public static Result postIndex() {
        
    	JsonHandler jh = new JsonHandler();
    	String subject = new String();
    	String predicate = "rdfs:subclassOf";
    	DynamicForm formData = Form.form().bindFromRequest();
    	
    	SparqlQuery query = new SparqlQuery(subject, predicate);

    	GetSparqlQuery query_submit = new GetSparqlQuery(query);

    	//TODO loop over all queries in query_submit.list_of_queries
    	TreeMap<String, SparqlQueryResults> query_results_list = new TreeMap<String, SparqlQueryResults>();
    	String final_query = null;

    	for (String tabName : query_submit.thingTypes){
    			final_query = query_submit.collection.toString();
    			String query_json = null;
    			try {
    				query_json = query_submit.executeQuery(tabName);
    			} catch (IllegalStateException | IOException e1) {
    				e1.printStackTrace();
    			}
    			SparqlQueryResults query_results = new SparqlQueryResults(query_json, tabName);
    			query_results_list.put(tabName, query_results);
    	}// /for tabname in types of entities
    	
        //Get the facets
        //getFacets(jh);
        
        //return ok("cool");
        // TODO: fix this, too
        //Form<FacetFormData> fd = Form.form(FacetFormData.class).fill(facet_form);
        System.out.println("hierarchy postIndex() was called!");
        return ok(hierarchy_faceting.render(query_results_list, final_query));
    }// /postIndex()

}
