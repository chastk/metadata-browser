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
import models.TreeQueryResults;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.FacetFormData;
import views.html.detector_browser;
import views.html.error_page;


public class Detector extends Controller {

    public static SparqlQueryResults query_results = new SparqlQueryResults();
    
    // for /metadata HTTP GET requests
    public static Result index() {
    	//Get query using http.GetSparqlQuery
        SparqlQuery query = new SparqlQuery();
        GetSparqlQuery query_submit = new GetSparqlQuery(query);
        String[] tabsToQuery = {"Detectors", "DetectorModels"}; 

        TreeMap<String, SparqlQueryResults> query_results_list = new TreeMap<String, SparqlQueryResults>();
        TreeMap<String, String> hierarchy_results_list = new TreeMap<String, String>();
        // This needs to be fixed to handle the tree rendering for Detectors!
        for (String tabName : query_submit.thingTypes){
            String query_json = null;
            if (tabName.endsWith("H")) {
                System.out.println("Instrument.java is requesting: " + tabName);
                try {
                    query_json = query_submit.executeQuery(tabName);
                } catch (IllegalStateException | IOException e1) {
                    return notFound(error_page.render(e1.toString()));
                    //e1.printStackTrace();
                }
                TreeQueryResults query_results = new TreeQueryResults(query_json, tabName);
                hierarchy_results_list.put(tabName, query_results.getQueryResult().replace("\n", " "));
            } else {
                try {
                    query_json = query_submit.executeQuery(tabName);
                } catch (IllegalStateException | IOException e1) {
                    return notFound(error_page.render(e1.toString()));
                    //e1.printStackTrace();
                }
                //System.out.println(query_json);
                SparqlQueryResults query_results = new SparqlQueryResults(query_json, tabName);
                query_results_list.put(tabName, query_results);
            }// /else
        }// /for tabName
        
        //Get the facets
        //getFacets(jh);
        System.out.println("Detector index() was called!");
        return ok(detector_browser.render(query_results_list, hierarchy_results_list, "All Documents"));
        
    }// /index()


    // for /metadata HTTP POST requests
    public static Result postIndex() {
    	//Form<FacetFormData> formData = Form.form(FacetFormData.class).fill(facet_form);
        JsonHandler jh = new JsonHandler();
        //Get query using http.GetSparqlQuery
        SparqlQuery query = new SparqlQuery();
        GetSparqlQuery query_submit = new GetSparqlQuery(query);
        // query_submit contains 7 queries: one for each thingType right now
        TreeMap<String, SparqlQueryResults> query_results_list = new TreeMap<String, SparqlQueryResults>();
        TreeMap<String, String> hierarchy_results_list = new TreeMap<String, String>();
    	String final_query = null;
        for (String tabName : query_submit.thingTypes){
            String query_json = null;
            if (tabName.endsWith("H")) {
                System.out.println("Instrument.java is requesting: " + tabName);
                try {
                    query_json = query_submit.executeQuery(tabName);
                } catch (IllegalStateException | IOException e1) {
                    return notFound(error_page.render(e1.toString()));
                    //e1.printStackTrace();
                }
                TreeQueryResults query_results = new TreeQueryResults(query_json, tabName);
                hierarchy_results_list.put(tabName, query_results.getQueryResult().replace("\n", " "));
            } else {
                try {
                    query_json = query_submit.executeQuery(tabName);
                } catch (IllegalStateException | IOException e1) {
                    return notFound(error_page.render(e1.toString()));
                    //e1.printStackTrace();
                }
                //System.out.println(query_json);
                SparqlQueryResults query_results = new SparqlQueryResults(query_json, tabName);
                query_results_list.put(tabName, query_results);
            }// /else
        }// /for tabName

        //Get the facets
        //getFacets(jh);
        
        System.out.println("detectors index() was called!");
        return ok(detector_browser.render(query_results_list, hierarchy_results_list, "All Documents"));
    }// /postIndex()

}
