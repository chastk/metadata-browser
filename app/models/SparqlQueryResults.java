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
    //public ArrayList<Document> the_docs = new ArrayList<Document>();

    public SparqlQueryResults () {} 

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
		
		JsonNode documents;
		
		//TODO: add ability to dynamcially parse the vars out from the header
		String subj = "s";
		String pred = "p";
		String obj = "o";
		
		System.out.println(node);
		
		//Need to update this to handle SPARQL-JSON format
		/*try {
			documents = node.get("bindings");
			Iterator<JsonNode> doc_iterator = documents.iterator();
			while (doc_iterator.hasNext()){
				JsonNode doc = doc_iterator.next();
				TreeMap<String, String> fields = new TreeMap<String, String>();
				
				Iterator<String> docFields = doc.fieldNames();
				while (docFields.hasNext()){
					String docField = docFields.next();
					fields.put(subj, doc.get(sub)j.asText());
					//System.out.println(docField);
				}
				
				List<JsonNode> characteristic = doc.findValues("characteristic");
				ArrayList<String> characteristics = new ArrayList<String>();
				for (JsonNode c : characteristic){
					Iterator<String> chars = c.fieldNames();
					while (chars.hasNext()){
						//TODO Rename this
						//TODO Figure out why I did this. Can't remember why it's here
						String the_thing = chars.next();
						//characteristics.add(the_thing);
						//System.out.println(the_thing);
					}
					System.out.println(c.toString());
					characteristics.add(c.toString());
				}
				the_docs.add(new Document(fields, characteristics));
			}
			//System.out.println(the_docs.size());
		} catch (Exception e){
			e.printStackTrace();
		}// /try/catch */
    }// /SparqlQueryResults()
}
