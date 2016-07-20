package com.workshop.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;


@Path("/myservice")
public class KylaRestService {

	@GET
	@Produces("application/json")
	@Path("json/{firstName}")
	public String getMessage(@PathParam("firstName") String firstName) {
        return "Hello " + firstName;
    }
}
