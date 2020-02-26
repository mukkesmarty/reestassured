package com.knoldus.restassured;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;

import com.github.fge.jsonschema.SchemaVersion;
import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

@Test(groups = {"needtoknow"})
public class NeedToKnowTest {
	public void toverifyJsonSchema() {
		JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.newBuilder()
		.setValidationConfiguration(
				ValidationConfiguration.newBuilder()
				.setDefaultVersion(SchemaVersion.DRAFTV4).freeze())
		.freeze();
		given().
				header("AppKey","Q3bWUuTVRTWMxWrlBhfpKy1CGPkNcQRO").
		when().
				get("https://aws-tst1.api.rccl.com/en/royal/mobile/v1/ships/EG/sailDate/20180827/needToKnow").
		then().
				statusCode(200)
				.body(matchesJsonSchemaInClasspath("needtoknowSchema4.json")
						.using(jsonSchemaFactory));
		
	}

}
