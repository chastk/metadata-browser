package controllers;

import java.util.TreeMap;

import http.GetSparqlQuery;
import java.io.IOException;
import models.SparqlQuery;
import models.SparqlQueryResults;
import models.TreeQuery;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.instrument_browser;


public class Instrument extends Controller {
	
	// for /instruments HTTP GET requests
    public static Result index() {
        TreeQuery tq = new TreeQuery("InstrumentModelH");
        SparqlQuery query = new SparqlQuery();
        GetSparqlQuery query_submit = new GetSparqlQuery(query);

        TreeMap<String, SparqlQueryResults> query_results_list = new TreeMap<String, SparqlQueryResults>();
        TreeMap<String, String> hierarchy_results_list = new TreeMap<String, String>();
        // This needs to be fixed to handle the tree rendering for Detectors!
        for (String tabName : query_submit.thingTypes){
            if (tabName.endsWith("H")) {
                System.out.println("Detector.java is requesting: " + tabName);
                TreeQuery treeq = new TreeQuery(tabName);
                hierarchy_results_list.put(tabName, treeq.getQueryResult().replace("\n", " "));
            } else {
                String query_json = null;
                try {
                    query_json = query_submit.executeQuery(tabName);
                } catch (IllegalStateException | IOException e1) {
                    e1.printStackTrace();
                }
                //System.out.println(query_json);
                SparqlQueryResults query_results = new SparqlQueryResults(query_json, tabName);
                query_results_list.put(tabName, query_results);
            }// /else
        }// /for tabName
        System.out.println("Instrument index() was called!");
        String tree_query_result = tq.getQueryResult().replace("\n", " ");
        return ok(instrument_browser.render(query_results_list, tree_query_result, hierarchy_results_list, "All Documents"));
        
    }// /index()


    // for /instruments HTTP POST requests
    public static Result postIndex() {
    	/*
    	String subject = new String();
    	String predicate = "rdfs:subclassOf";
    	SparqlQuery query = new SparqlQuery(subject, predicate);
    	GetSparqlQuery query_submit = new GetSparqlQuery(query);
    	//for (String tabName : query_submit.thingTypes){
    			//final_query = query_submit.collection.toString();
    			String query_json = null;
    			try {
    				query_json = query_submit.executeQuery("InstrumentModelsH");
    			} catch (IllegalStateException | IOException e1) {
    				e1.printStackTrace();
    			}
    			//query_results_list.put(tabName, query_json);
    	//}// /for tabname in types of entities
    	
        System.out.println("Instrument postIndex() was called!");
        return ok(instrument_browser.render(query_json));
    	*/
        TreeQuery tq = new TreeQuery("InstrumentModelH");
        SparqlQuery query = new SparqlQuery();
        GetSparqlQuery query_submit = new GetSparqlQuery(query);

        TreeMap<String, SparqlQueryResults> query_results_list = new TreeMap<String, SparqlQueryResults>();
        TreeMap<String, String> hierarchy_results_list = new TreeMap<String, String>();
        // This needs to be fixed to handle the tree rendering for Detectors!
        for (String tabName : query_submit.thingTypes){
            if (tabName.endsWith("H")) {
                System.out.println("Detector.java is requesting: " + tabName);
                TreeQuery treeq = new TreeQuery(tabName);
                hierarchy_results_list.put(tabName, tq.getQueryResult().replace("\n", " "));
            } else {
                String query_json = null;
                try {
                    query_json = query_submit.executeQuery(tabName);
                } catch (IllegalStateException | IOException e1) {
                    e1.printStackTrace();
                }
                //System.out.println(query_json);
                SparqlQueryResults query_results = new SparqlQueryResults(query_json, tabName);
                query_results_list.put(tabName, query_results);
            }// /else
        }// /for tabName
        System.out.println("Instrument index() was called!");
        String tree_query_result = tq.getQueryResult().replace("\n", " ");
        return ok(instrument_browser.render(query_results_list, tree_query_result, hierarchy_results_list, "All Documents"));
        
    }// /postIndex()

}
