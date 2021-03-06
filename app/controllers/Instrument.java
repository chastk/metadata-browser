package controllers;

import java.util.TreeMap;

import http.GetSparqlQuery;
import java.io.IOException;
import models.SparqlQuery;
import models.SparqlQueryResults;
//import models.TreeQuery;
import models.TreeQueryResults;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.instrument_browser;
import views.html.error_page;


public class Instrument extends Controller {
	
	// for /instruments HTTP GET requests
    public static Result index() {
        //TreeQuery tq = new TreeQuery("InstrumentModelH");
        SparqlQuery query = new SparqlQuery();
        GetSparqlQuery query_submit = new GetSparqlQuery(query);
        String[] tabsToQuery = {"Instruments", "InstrumentModels", "InstrumentModelsH"}; 

        TreeMap<String, SparqlQueryResults> query_results_list = new TreeMap<String, SparqlQueryResults>();
        TreeMap<String, String> hierarchy_results_list = new TreeMap<String, String>();
        for (String tabName : tabsToQuery){
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
        System.out.println("Instrument index() was called!");
        //String tree_query_result = tq.getQueryResult().replace("\n", " ");
        return ok(instrument_browser.render(query_results_list, hierarchy_results_list, "All Documents"));
    }// /index()


    // for /instruments HTTP POST requests
    public static Result postIndex() {
        //TreeQuery tq = new TreeQuery("InstrumentModelH");
        SparqlQuery query = new SparqlQuery();
        GetSparqlQuery query_submit = new GetSparqlQuery(query);

        TreeMap<String, SparqlQueryResults> query_results_list = new TreeMap<String, SparqlQueryResults>();
        TreeMap<String, String> hierarchy_results_list = new TreeMap<String, String>();
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
        System.out.println("Instrument postIndex() was called!");
        //String tree_query_result = tq.getQueryResult().replace("\n", " ");
        return ok(instrument_browser.render(query_results_list, hierarchy_results_list, "All Documents"));
        
    }// /postIndex()
}