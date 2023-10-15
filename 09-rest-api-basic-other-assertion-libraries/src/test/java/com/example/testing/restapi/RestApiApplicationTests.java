package com.example.testing.restapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;


/**
 * 
 * Separate test configuration file is present in src/main/test/resources folder.
 * 
 * Optionally, we can also define its location here.
 *
 */

//@TestPropertySource(locations={"classpath:test-configuration.properties"})

@SpringBootTest
class RestApiApplicationTests {

	@Test
	void contextLoads() {
	}

}
