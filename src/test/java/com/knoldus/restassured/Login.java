package com.knoldus.restassured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import org.testng.annotations.Test;
import com.github.fge.jsonschema.SchemaVersion;
import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Login {
	
	@Test
	public void loginMethod(){
		LoginPOJO obj1 = new LoginPOJO();
		obj1.setEmail("akash1@mailinator.com");
		obj1.setPassword("asdfghjkl");
		
		RestAssured.baseURI  = "http://18.212.167.3/development/doorguy_backend/public/index.php/api/v1";
		String st1 = given()
		.contentType(ContentType.TEXT)
		.contentType("application/json")
		.body(obj1)
		.when()
		.post("/driver/login")
		.then().extract().asString();
		System.out.println(st1);
		
	}
	
}
