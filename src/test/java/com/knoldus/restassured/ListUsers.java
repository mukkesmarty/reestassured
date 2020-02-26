package com.knoldus.restassured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;


import java.util.List;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.fge.jsonschema.SchemaVersion;
import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

@Test
public class ListUsers {
	public void getusers()
	{
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.defaultParser = Parser.JSON;
		
		/*List<Map<String, Object>> users = given()
		.when()
		.get("/api/users?page=2").as(new TypeRef<List<Map<String,Object>>>() {});*/
		Response  users = given()
		.when()
		.get("/api/users?page=2")
		.then()
		.contentType("application/json")
		.using().extract().response();
		
		System.out.println(users.asString());
	
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(users.path("page"), 2);
		
		
		softassert.assertAll();
		
		
	}

}
