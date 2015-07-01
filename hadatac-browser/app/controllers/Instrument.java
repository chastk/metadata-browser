package controllers;

import http.GetSparqlQuery;
import java.io.IOException;
import models.SparqlQuery;
import models.TreeQuery;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.instrument_browser;


public class Instrument extends Controller {
	
	// for /metadata HTTP GET requests
    public static Result index() {

    	TreeQuery tq = new TreeQuery("InstrumentModelH");
    	
        System.out.println("Instrument index() was called!");
        return ok(instrument_browser.render(tq.getQueryResult().replace("\n", " ")));
        
    }// /index()


    // for /metadata HTTP POST requests
    public static Result postIndex() {
        
    	String subject = new String();
    	String predicate = "rdfs:subclassOf";
    	SparqlQuery query = new SparqlQuery(subject, predicate);

    	GetSparqlQuery query_submit = new GetSparqlQuery(query);

    	//TODO loop over all queries in query_submit.list_of_queries
    	//TreeMap<String, String> query_results_list = new TreeMap<String, String>();
    	//String final_query = null;

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
    }// /postIndex()

}
