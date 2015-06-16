package models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SparqlQueryResults extends QueryResults {

    public String json;
    public ArrayList<TripleDocument> triples_list = new ArrayList<TripleDocument>();
    
    public SparqlQueryResults () {} 

    // This constructor assumes that json is a well-formed JSON string
    //  which also conforms to the SPARQL 1.1 Query Results JSON format:
    //  http://www.w3.org/TR/sparql11-results-json/ 
    public SparqlQueryResults (String json) {
        this.json = json;
        //System.out.println(json);
        // create an ObjectMapper instance.
        ObjectMapper mapper = new ObjectMapper();
        // use the ObjectMapper to read the json string and create a tree
        JsonNode node = null;
		try {
			node = mapper.readTree(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
		node = node.get("results");
		JsonNode bindings;
		bindings = node.get("bindings");
		
		//TODO: add ability to dynamcially parse the vars out from the header
		String subj = "s";
		String pred = "p";
		String obj = "o";
		
		Iterator<JsonNode> iter = bindings.iterator();
		
		//Need to update this to handle SPARQL-JSON format
		try {
		    while (iter.hasNext()){
				JsonNode doc = iter.next();
				TripleDocument triple = new TripleDocument(doc);
				//System.out.println(triple);
				triples_list.add(triple);
	
			}
			//System.out.println(the_docs.size());
		} catch (Exception e){
			e.printStackTrace();
		}// /try/catch
    }// /SparqlQueryResults()
}
