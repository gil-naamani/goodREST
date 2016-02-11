package com.practice.rest;

import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class GreetingTest {
	//@Test
	public void testDefault() {
		expect().body("greeting", equalTo("Hello World")).when().get("/helloworld/");
	}
	//@Test
	public void testSpecific() {
		expect().body("greeting", equalTo("Hello John")).when().get("/helloworld/John");
	}
	
}
