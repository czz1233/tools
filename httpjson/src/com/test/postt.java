package com.test;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;



public class postt {
    public static void main(String[] args) throws UnirestException  {
    	HttpResponse<JsonNode> response =null;
				response = Unirest.get("http://api.heclouds.com/devices/524101347/datastreams/value")
						  .header("api-key", "YI5q3PZTZfG2Syteb=PUdjomijA=")
						  .header("cache-control", "no-cache")
						  .header("postman-token", "67ebdd93-ac2a-9e41-e1de-14370bf6dacf")
						  .asJson();
				
			
			System.out.println(response.getBody());
		
        
        
    }

    
    
    
}
