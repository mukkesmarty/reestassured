package com.knoldus.restassured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
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
		/*given().
				header("AppKey","Q3bWUuTVRTWMxWrlBhfpKy1CGPkNcQRO").
		when().
				get("https://tst1.api.rccl.com/en/royal/mobile/v2/weather/latitude/25.986076/longitude/80.30356/duration/9").
		then().
				statusCode(200)
				.body(matchesJsonSchemaInClasspath("weatherSchema4.json")
						.using(jsonSchemaFactory));*/
		
	}

}
