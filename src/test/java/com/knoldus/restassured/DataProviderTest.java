package com.knoldus.restassured;

import org.testng.annotations.Test;

public class DataProviderTest {
	
	//dataProvider using dataprovider name attribute
@Test(dataProvider = "data-provider1", dataProviderClass = DataProviderClass.class)
public void testMethod(String data, String data2) 
{
	System.out.print("Data is:"+data);
	System.out.println("Data is:"+data2);
}


//dataProvider using method name 
@Test(dataProvider = "dataProviderMethod2", dataProviderClass = DataProviderClass.class)
public void testMethod2(String data1, String data2) 
{
	System.out.println("data is :: "+ data1);
	System.out.println("data is :: "+ data2);
}

//
}
