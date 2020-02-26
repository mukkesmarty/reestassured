package com.knoldus.restassured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestSerialization {
	public static void main(String[] args) {
		Message message = new Message();
		message.setEmail("eve.holt@reqres.in");
		message.setPassword("pistol");
		
		try {
			System.out.println(new ObjectMapper().writeValueAsString(message));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String st = given()
				.contentType("application/json")
				.body(message).
		when().
		post("https://reqres.in/api/register").then().extract().response().asString();
		
		System.out.println(st);
	}

	
}
