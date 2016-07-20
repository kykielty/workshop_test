package com.workshop.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.JsonObject;
import com.workshop.utility.Utility;

@Path("/myJson")
public class TestService {

    @GET
    @Produces("application/json") 
    @Path("/json")
    public String getJson() {
    	JsonObject jObject = Utility.convertFileToJSON("kyla.json");
    	return jObject.toString();
    }
}
