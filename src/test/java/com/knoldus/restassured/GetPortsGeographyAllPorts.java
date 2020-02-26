package com.knoldus.restassured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import org.testng.annotations.Test;
import com.github.fge.jsonschema.SchemaVersion;
import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;


public class GetPortsGeographyAllPorts {
	public static void toVerifyJsonSchema(){
		JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.newBuilder()
				.setValidationConfiguration(
						ValidationConfiguration.newBuilder()
						.setDefaultVersion(SchemaVersion.DRAFTV4).freeze())
				.freeze();
		given().
			header("AppKey","Q3bWUuTVRTWMxWrlBhfpKy1CGPkNcQRO").
		when().
			get("https://tst1.api.rccl.com/en/royal/mobile/v1/geo/ports").
		then().
			statusCode(200)
			.body(matchesJsonSchemaInClasspath("needtoknowSchema4.json")
				.using(jsonSchemaFactory));
	}
	
}
