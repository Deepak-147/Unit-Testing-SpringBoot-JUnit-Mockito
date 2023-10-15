package com.example.testing.restapi.controller;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

/**
 * 
 * The @SpringBootTest annotation starts the full application context, which includes all the beans required for the application to function. 
 * On the other hand, the @WebMvcTest annotation creates an application context with a limited number of beans, specifically those related to the Web Layer.
 * The @SpringBootTest annotation is typically used for integration tests, where you need to test the whole application from a top-down perspective. 
 * In contrast, the @WebMvcTest annotation is more focused and is used to test the Web Layer.
 */

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ItemControllerIT {
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void contextLoads() throws JSONException {
		String expectedResponse = "[{id: 10001, name: Item1, price: 10, quantity: 20}, {id: 10002, name: Item2, price: 5, quantity: 10}, {id: 10003, name: Item3, price: 15, quantity: 2}]";
		String actualResponse = this.restTemplate.getForObject("/all-items-from-database", String.class);

		// assertEquals behind the scenes uses JSONAssert.assertEquals(expected, actual, strict)
		JSONAssert.assertEquals(expectedResponse, actualResponse, false); // non strict mode of checking
	}
}
