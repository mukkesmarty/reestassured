package com.knoldus.restassured;

import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assumptions.assumeThat;


import java.util.ArrayList;
import java.util.List;

public class AssertjExample {

	
	public String stringMethod() 
	{
		String word = "Hi this is string example";
		return word;
	}
	
	public int integerMethod() 
	{
		int num = 23;
		return num;
	}
	
	public List<Integer> listMethod()
	{
		List<Integer> list1 = new ArrayList<>();
		list1.add(0,1);
		list1.add(1,2);
		list1.add(2,3);
		list1.add(3,4);
		list1.add(4,5);
		list1.add(5,5);
		return list1;
	}
	
	//Simple assertion
	@Test(groups = {"tst"})
	public void TC_01() 
	{
		AssertjExample obj1 = new AssertjExample();
		assertThat(obj1.stringMethod()).isEqualTo("Hi this is string example").isNotEqualTo("hi this is me");
	}
	
	//String type assertion
	@Test(groups = {"tst"})
	public void TC_02_StringTypeAssertion() 
	{
		AssertjExample obj1 = new AssertjExample();
		assertThat(obj1.stringMethod()).isNotNull()
										.startsWith("Hi")
										.contains("string")
										.endsWith("example");
	}
	
	//Integer type assertion
	@Test(groups = {"tst"})
	public void TC_03_IntTypeAssertion() 
	{
		AssertjExample obj1 = new AssertjExample();
		assertThat(obj1.integerMethod()).isBetween(10, 30)
										.isGreaterThan(20)
										.isLessThan(24);
	}
	
	//List Type assertions
	@Test(groups= {"tst"})
	public void TC_04_ListOfIntegerTypeAssertion() 
	{
		AssertjExample obj1 = new AssertjExample();
		assertThat(obj1.listMethod()).contains(2, 1)
									.containsAnyOf(2,3,4)
									.containsOnly(1,2,3,4,5);
	}
	
	//softassertion
	@Test(groups = {"tst"})
	public void TC_05_softAssertionExample() 
	{
		SoftAssertions softly = new SoftAssertions(); 

		  softly.assertThat("George Martin").as("great authors").isEqualTo("JRR Tolkien");  
		  softly.assertThat(42).as("response to Everything").isGreaterThan(100); 
		  softly.assertThat("Gandalf").isEqualTo("Sauron");
		  
		  softly.assertAll();
	}
	
	//Assumptions
	@Test(groups = {"tst"})
	public void TC_06_assumtionExample() 
	{
		assumeThat(1).isEqualTo(2);
		assumeThat("mukesh").isBlank();
		assertThat("test assert").isEqualTo("test assert");
		assertThat("Hi").isEqualTo("hi");
	}
	
}
