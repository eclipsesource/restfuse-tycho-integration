package com.eclipsesource.restfuse.example.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path( "/hello" )
public class SampleService {
	
	@GET
	public String sayHello() {
		return "hello";
	}

}
