package com.knoldus.restassured;

//import static org.testng.Assert.assertEquals;
//import static org.testng.AssertJUnit.*;
import static org.testng.AssertJUnit.assertEquals;

//import org.junit.jupiter.api.Test;

import org.testng.annotations.Test;

public class Demotest {

	@Test
	public void verify() 
	{
		String st1 = "Buest";
		assertEquals("Buest",st1);
	}
}
