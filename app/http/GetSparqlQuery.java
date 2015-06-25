package http;

import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;


import models.Query;
import models.SparqlQuery;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GetSparqlQuery {

    public StringBuffer sparql_query = new StringBuffer();
    public TreeMap<String, StringBuffer> list_of_queries = new TreeMap<String, StringBuffer>();
    public String collection;
    private int numThings = 8;
    public String[] thingTypes = new String[numThings];
    
    public GetSparqlQuery () {} 

    
    //list_of_queries contains all the queries to execute
    //this.sparql_query will be a query to return all documents in the last collection of
    //collection_urls.
    //this.sparql_query should NOT BE USED OUTSIDE OF THIS CLASS UNLESS YOU KNOW WHAT YOU'RE DOING
    //I'm mostly talking to myself here.

    // for SPARQL queries!
    public GetSparqlQuery (SparqlQuery query) {
        //addSparqlUrls();
        addThingTypes();
        this.collection = "http://jeffersontest.tw.rpi.edu/solr4/store/sparql";
        for (String tabName : thingTypes ){
            this.sparql_query = new StringBuffer();
            this.sparql_query.append(collection);
            this.sparql_query.append("?q=");
            String q = querySelector(tabName);
            /*String q = "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>" + 
                       "PREFIX owl: <http://www.w3.org/2002/07/owl#>" + 
                       "SELECT ?s ?p ?o WHERE {" +
                       "    ?s rdfs:subClassOf+" + 
                       "    <http://jefferson.tw.rpi.edu/ontology/vstoi#Platform>  ." + 
                       "    ?p a ?s ." + 
                       "    ?p rdfs:label ?o ." + 
                       "}";*/
            //String q = "SELECT ?s ?p ?o WHERE {}"
            
            String quote = new String();
            try {
                this.sparql_query.append(URLEncoder.encode(q, "UTF-8"));
                quote = URLEncoder.encode("\"", "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            
            /*for (String field_facet_category : query.field_facets.facets.keySet()){
                for (String field_facet : query.field_facets.facets.get(field_facet_category).keySet()){
                    this.sparql_query.append(String.format("&fq=%s:%s%s%s", field_facet_category.replace(" ", "%20"), quote, field_facet.replace(" ", "%20"), quote));
                }
            }*/
            //System.out.println(tabName + " : " + this.sparql_query);
            this.list_of_queries.put(tabName, this.sparql_query);
        }
    }// /getSolrQuery for SPARQL

    // TYPES of THINGS in the metadata. These should be high-level concepts.
    // If this list is updated, make sure each new thingtype has a corresponding
    //  query in the method below, and that numThings is updated accordingly.
    // (Until I make a more dynamic implementation for this....)
    // IDEA: a config file that we can parse into Thing + query, with methods to check it dynamically?
    public void addThingTypes(){
        thingTypes[0] = "Platforms";
        thingTypes[1] = "PlatformModels";
        thingTypes[2] = "Instruments";
        thingTypes[3] = "InstrumentModels";
        thingTypes[4] = "Detectors";
        thingTypes[5] = "DetectorModels";
        thingTypes[6] = "Entities";
        thingTypes[7] = "InstrumentModelsH";
    }
    
    public String querySelector(String tabName){
        // default query?
        String q = "SELECT * WHERE { ?s ?p ?o } LIMIT 10";
        switch (tabName){
            case "Platforms" : 
                q = "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#> " + 
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#> " + 
                    "PREFIX vstoi: <http://jefferson.tw.rpi.edu/ontology/vstoi#> " + 
                    "SELECT ?platName ?platModelName ?sn WHERE {" +
                    "    ?platModel rdfs:subClassOf+" + 
                    "    <http://jefferson.tw.rpi.edu/ontology/vstoi#Platform>  ." + 
                    "    ?plat a ?platModel ." +
                    "    ?platModel rdfs:label ?platModelName ." +
                    "    ?plat rdfs:label ?platName ." + 
                    "    ?plat vstoi:hasSerialNumber ?sn ." + 
                    "}";
                break;
            case "PlatformModels" : 
                q = "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>" + 
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>" + 
                    "SELECT ?src ?label WHERE {" +
                    "    ?src rdfs:subClassOf+" + 
                    "    <http://jefferson.tw.rpi.edu/ontology/vstoi#Platform>  ." + 
                    "    ?src rdfs:label ?label ." + 
                    "}";
                break;
            case "Instruments" : 
                q = "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>" + 
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>" + 
                    "SELECT ?src ?dest ?dest_label WHERE {" +
                    "    ?src rdfs:subClassOf+" + 
                    "    <http://jefferson.tw.rpi.edu/ontology/vstoi#Instrument>  ." + 
                    "    ?dest a ?src ." + 
                    "    ?dest rdfs:label ?dest_label ." + 
                    "}";
                break;
            case "InstrumentModels" : 
                q = "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>" + 
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>" + 
                    "SELECT ?src ?label WHERE {" +
                    "    ?src rdfs:subClassOf+" + 
                    "    <http://jefferson.tw.rpi.edu/ontology/vstoi#Instrument>  ." + 
                    "    ?src rdfs:label ?label ." + 
                    "}";
                break;
            case "Detectors" : 
                q = "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>" + 
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>" + 
                    "SELECT ?src ?dest ?dest_label WHERE {" +
                    "    ?src rdfs:subClassOf+" + 
                    "    <http://jefferson.tw.rpi.edu/ontology/vstoi#Detector>  ." + 
                    "    ?dest a ?src ." + 
                    "    ?dest rdfs:label ?dest_label ." + 
                    "}";
                break;
            case "DetectorModels" : 
                q = "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>" + 
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>" + 
                    "SELECT ?src ?label WHERE {" +
                    "    ?src rdfs:subClassOf+" + 
                    "    <http://jefferson.tw.rpi.edu/ontology/vstoi#Detector>  ." + 
                    "    ?src rdfs:label ?label ." + 
                    "}";
                break;
            case "Entities" : 
                q = "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>" + 
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>" + 
                    "SELECT ?src ?dest ?dest_label WHERE {" +
                    "    ?src rdfs:subClassOf+" + 
                    "    <http://ecoinformatics.org/oboe/oboe.1.0/oboe-core.owl#Entity>  ." + 
                    "    ?dest a ?src ." + 
                    "    ?dest rdfs:label ?dest_label ." + 
                    "}";
                break;
            case "InstrumentModelsH" : 
                q = "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>" + 
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>" + 
                	"SELECT ?modelName ?superModelName WHERE { " + 
                    "   ?model rdfs:subClassOf* <http://jefferson.tw.rpi.edu/ontology/vstoi#Instrument> . " + 
                	"   ?model rdfs:subClassOf ?superModel .  " + 
                	"   OPTIONAL { ?model rdfs:label ?modelName }  " + 
                	"   OPTIONAL { ?superModel rdfs:label ?superModelName }  " +
                	"}";
                break;
        }// /switch
        return q;
    }// /querySelector


    //Preconditions: The GetSparqlQuery object has been initialized with a Query object
    //Inputs: None. Executes query based on the member string sparql_query.
    //Output: Returns JSON in the form of a string. Currently does not handle http errors
    //		  very gracefully. Need to change this.
    //Postconditions: None
    public String executeQuery(String tab) throws IllegalStateException, IOException{
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //HttpGet get = new HttpGet(this.collection_urls.get(collection));
        
        Scanner in = null;
        try {
        	HttpClient client = new DefaultHttpClient();
        	HttpGet request = new HttpGet(list_of_queries.get(tab).toString().replace(" ", "%20"));
        	//System.out.println(tab + " : " + list_of_queries.get(tab));
        	request.setHeader("Accept", "application/sparql-results+json");
        	HttpResponse response = client.execute(request);
            StringWriter writer = new StringWriter();
            IOUtils.copy(response.getEntity().getContent(), writer, "utf-8");
    
            return writer.toString();
            
        } finally
        {
            //in.close();
            //request.close();
        }
    }// /executeQuery()
}
