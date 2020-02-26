package com.knoldus.restassured;


import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMethodDemo {

	@Test(enabled = false)
	public static void TC_01_UsingTestngAssert() {

		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = "/api";

		Response response = given().contentType("application/json").get("/users?page=1").then().using().extract().response();

		//String body = response.getBody().asString();
		int status = response.getStatusCode();
		System.out.println(response.getBody().asString());
		Assert.assertEquals(status, 200);
		Assert.assertEquals(response.getBody().path("data[2].id").toString(),"3");
		Assert.assertEquals(response.jsonPath().get("data[2].email") , "emma.wong@reqres.in");
		Assert.assertEquals(response.jsonPath().getInt("data[2].id"), 3); 
	}
	
	@Test(enabled = false)
	public static void TC_02_UsingAssertj() {
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = "/api";
		
		Response response = given().contentType("application/json").get("/users?page=1").then().using().extract().response();
		//String body = response.getBody().asString();
		
		// Asserting status code
		assertThat(response.getStatusCode()).isEqualTo(200);
		assertThat(response.jsonPath().getInt("data[2].id")).isNotNull();
	}
	
	@Test(enabled = true)
	public static void TC_03_UsingSoftAssert() {
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = "/api";
		
		Response response = given().contentType("application/json").get("/users?page=1").then().using().extract().response();
		
		int status = response.getStatusCode();
		System.out.println(response.getBody().asString());
		
		SoftAssert softassert = new SoftAssert();
		
		Assert.assertEquals(status, 201);
		Assert.assertEquals(response.getBody().path("data[2].id").toString(),"3");
		Assert.assertEquals(response.jsonPath().get("data[2].email") , "emma.wong@reqres.in");
		Assert.assertEquals(response.jsonPath().getInt("data[2].id"), 4);
		
		softassert.assertAll();
	}
}
