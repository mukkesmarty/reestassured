package com.knoldus.restassured;

import org.junit.Assert;
import org.testng.annotations.Test;

public class MultiTestDependency {
	@Test
	public void start() {
		System.out.println("starting the new server");
	}
	
	@Test (dependsOnMethods = "start")
	public void init() {
		System.out.println("initializing the data for processing");
	}
	
	@Test (dependsOnMethods = "init")
	public void process() {
		Assert.assertTrue(false);
		System.out.println("processing the data");
	}
	
	@Test (dependsOnMethods = {"process"})
	public void stop() {
		System.out.println("stopping the server"); 
	}

}
