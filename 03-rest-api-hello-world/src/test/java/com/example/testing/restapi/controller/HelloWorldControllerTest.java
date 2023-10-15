package com.example.testing.restapi.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * Web Layer: Front controllers
 * Service Layer: Business service
 * Data Layer: Database interactions
 * 
 * Web layer interacts with Service layer which in turn interacts with the Data layer
 * 
 * @WebMvcTest annotation creates an application context with a limited number of beans, specifically those related to the Web Layer
 * By limiting the number of beans in the application context, @WebMvcTest can help you isolate the Web Layer and make tests faster and more focused.
 */

@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void helloWorld_basic() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders
				.get("/hello-world")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().string("Hello World"))
				.andReturn();
		
//		assertEquals("Hello World", result.getResponse().getContentAsString());
	}
}
