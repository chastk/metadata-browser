package models;

import http.GetSparqlQuery;

import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TreeQuery {

	//Get query using http.GetSparqlQuery
    SparqlQuery query = new SparqlQuery();
    GetSparqlQuery query_submit = new GetSparqlQuery(query);

	TreeNode newTree = null;

	public TreeQuery(String tabQuery) {
		System.out.println("REQUESTED: <" + tabQuery + ">");
		String query_json = null;
	    try {
			query_json = query_submit.executeQuery(tabQuery);
			System.out.println("AQUI ESTA O RESULTADO: <" + query_json + ">");
		} catch (IllegalStateException | IOException e1) {
	        e1.printStackTrace();
		}
	
	    ObjectMapper mapper = new ObjectMapper();
	    // use the ObjectMapper to read the json string and create a tree
	    JsonNode rootNode = null;
		try {
			rootNode = mapper.readTree(query_json);
			System.out.println("AQUI ESTA O TAMANHO DO RESULTADO 2: <" + rootNode.size() + ">");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		//JsonNode phoneNosNode = rootNode.path("phoneNumbers");
		JsonNode bindingsNode = rootNode.findPath("bindings");
		System.out.println("AQUI ESTA O TAMANHO DO BINDINGS: <" + bindingsNode.size() + ">");
		Iterator<JsonNode> elements = bindingsNode.elements();
	
	
		String modelN = null;
		String superN = null;
		while (elements.hasNext()){
			modelN = "";
			superN = "";
		    JsonNode binding = elements.next();
		    JsonNode modelNameNode = binding.findPath("modelName");
		    if (modelNameNode != null && modelNameNode.get("value") != null) {
		    	modelN = modelNameNode.get("value").asText();
		    }
			JsonNode superNameNode = binding.findPath("superModelName");
		    if (superNameNode != null && superNameNode.get("value") != null) {
		    	superN = superNameNode.get("value").asText();
		    }
	
		    if (superN.equals("")) {
		    	newTree = new TreeNode(modelN);
		    } else {
		    	TreeNode parent;
		    	if (newTree == null) {
		    		parent = null;
		    	} else {
		    	    parent = newTree.hasValue(superN);
		    	}
		    	if (parent == null) {
		    		System.out.println("Parent <" + superN + "> not found");
		    	} else {
		    		TreeNode copyNode = newTree.hasValue(modelN);
		    		if (copyNode == null) {
     		    		parent.addChild(modelN);
		    		}
		    	}
		    }
		    System.out.println("model Name = <"+ modelN + " , " + superN + ">"); 
		}
		System.out.println("JSON RESULTANTE: <" + newTree.toJson(0) + ">");
    }

    public String getQueryResult() {
    	if (newTree == null) 
    		return "";
    	else
    		return newTree.toJson(0);
    }
    
}
