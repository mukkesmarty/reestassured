package com.knoldus.restassured;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostMethodDemo {

	@Test(enabled = false)
	public static void TC_01_UsingString(){

		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = "/api";

		Response response = given().contentType("application/json").body("{\n" + 
				"    \"name\": \"morpheus\",\n" + 
				"    \"job\": \"leader\"\n" + 
				"}\n" + 
				"").when().post("/users").then().using().extract().response();

		String body = response.getBody().asString();
		int status = response.getStatusCode();
		System.out.println(response.getBody().asString());
		Assert.assertEquals(status, 201);
	}


	@Test(enabled = false)
	public static void TC_02_UsingObject(){

		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = "/api";

		CreatePOJO createpojo = new CreatePOJO();
		createpojo.setName("morpheus2");
		createpojo.setJob("leader2");

		Response response = given().contentType("application/json").body(createpojo).when().post("/users").then().using().extract().response();

		String body = response.getBody().asString();
		int status = response.getStatusCode();
		System.out.println(response.getBody().asString());
		Assert.assertEquals(status, 201);
	}


	@Test(enabled = false)
	public static void TC_03_AssertionDemo(){

		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = "/api";

		CreatePOJO createpojo = new CreatePOJO();
		createpojo.setName("morpheus2");
		createpojo.setJob("leader2");

		Response response = given().contentType("application/json").body(createpojo).when().post("/users").then().using().extract().response();

		Assert.assertEquals(response.getHeaders().getValue("CF-Cache-Status"), "DYNAMIC");
		Assert.assertEquals(response.getStatusCode(), 201);
		Assert.assertEquals(response.path("name"), "morpheus2");
		Assert.assertEquals(response.path("job"), "leader2");
	}


	@Test(enabled = true)
	public static void TC_04_SoftAssertionDemo(){

		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = "/api";

		CreatePOJO createpojo = new CreatePOJO();
		createpojo.setName("morpheus2");
		createpojo.setJob("leader2");

		Response response = given().contentType("application/json").body(createpojo).when().post("/users").then().using().extract().response();

		SoftAssert softassert = new SoftAssert();
		Assert.assertEquals(response.getHeaders().getValue("CF-Cache-Status"), "DYNAMIC");
		Assert.assertEquals(response.getStatusCode(), 201);
		Assert.assertEquals(response.path("name"), "morpheus2");
		Assert.assertEquals(response.path("job"), "leader2");
		softassert.assertAll();
	}
}
