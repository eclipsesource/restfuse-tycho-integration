package com.eclipsesource.restfuse.example.test;

import static com.eclipsesource.restfuse.example.test.AllTests.BASE_URL;
import static junit.framework.Assert.assertEquals;

import org.junit.Rule;
import org.junit.runner.RunWith;

import com.eclipsesource.restfuse.Destination;
import com.eclipsesource.restfuse.HttpJUnitRunner;
import com.eclipsesource.restfuse.Method;
import com.eclipsesource.restfuse.Response;
import com.eclipsesource.restfuse.annotation.Context;
import com.eclipsesource.restfuse.annotation.HttpTest;

@RunWith( HttpJUnitRunner.class )
public class SampleServiceTest {

	@Rule
	public Destination destination = new Destination(BASE_URL);
	
	@Context
	private Response response;
	
	@HttpTest( path = "/services/hello", method = Method.GET )
	public void testBody() {
		String body = response.getBody(String.class);
		
		assertEquals("hello", body);
	}
}
