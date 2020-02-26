package com.knoldus.restassured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.module.jsv.JsonSchemaValidator.*;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.fge.jsonschema.SchemaVersion;
import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import io.restassured.response.Response;


public class WeatherInfoTest {
	
	@Test(groups = {"weatherinfo",})
	@Parameters({"AppKey"})
	public void toverifysuccesscase(String appKey) {
		//System.out.println("HI:"+appKey);
		
		JsonSchemaFactory jsonSchemaFactory =  JsonSchemaFactory.newBuilder()
				.setValidationConfiguration(
						ValidationConfiguration.newBuilder()
						.setDefaultVersion(SchemaVersion.DRAFTV4).freeze())
						//.setDefaultVersion(SchemaVersion.DRAFTV4).freeze())
						.freeze();
		given().
				header("AppKey",appKey).
		when().
				get("https://tst1.api.rccl.com/en/royal/mobile/v2/weather/latitude/25.986076/longitude/80.30356/duration/9").
		then().
				statusCode(200)
				.body(matchesJsonSchemaInClasspath("weatherSchema4.json")
				.using(jsonSchemaFactory));
	}
	
	@Test(groups = {"weatherinfo"})
	public void toVerifyResponse() {
		given()
			.header("APPKEY", "Q3bWUuTVRTWMxWrlBhfpKy1CGPkNcQRO").
		when()
			.get("https://tst1.api.rccl.com/en/royal/mobile/v2/weather/latitude/25.986076/longitude/80.30356/duration/9").
		then().body("payload.forecast.day", hasItems(1,2,3,4,5,6,7,8,9));			
	} 
	
	@Test(groups = {"tst"})
	@Parameters({"AppKey"})
	public void toCountHumidity(String AppKey) {
	Response response =	given()
			.header("APPKEY", AppKey).
		when()
			.get("https://tst1.api.rccl.com/en/royal/mobile/v2/weather/latitude/25.986076/longitude/80.30356/duration/9").
		then().extract().response();
	List<Float> humidities = new ArrayList<Float>();
	List al = new ArrayList();
	
	humidities = response.path("payload.forecast.humidity");
	humidities.add(Float.valueOf(11.11f));
	humidities.add(12.12F);
	al = response.path("payload.forecast.humidity");
	// way to creating soft Assertion in TestNG
	SoftAssert softAssert = new SoftAssert();
	System.out.println("HI");
	for(int i=0; i<humidities.size(); i++) {
		System.out.println(humidities.get(i));
	}
	
	}
}
