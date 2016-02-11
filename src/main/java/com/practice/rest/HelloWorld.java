package com.practice.rest;
 
import io.swagger.annotations.*;
import io.swagger.annotations.ApiResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/hello")
@Api(value = "hello")
public class HelloWorld 
{
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Say Hello World", 
				  notes = "Just a simple greeting")
	public Greeting defaultHelloWorld(){
		
		final Greeting greeting = new Greeting();
		return greeting;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{word}")
	@ApiOperation(value = "Say Hello to someone",
    			  notes = "Who are you thinking about right now?")
	public Greeting customHelloWorld(@PathParam("word") final String word) {
		if (word.equals("secret")) {
			return null;
		}
		final Greeting greeting = new Greeting(word);
		
		return greeting;
	}
}
