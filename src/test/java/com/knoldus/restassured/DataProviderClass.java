package com.knoldus.restassured;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
@DataProvider(name = "data-provider1")
public static Object[][] dataProviderMethod()
{
	
	//Object var1[][] = new Object[][] {{"data-one","pass1"},{"data two","pass2"},{"data three","pass3"},{"data four","pass4"},{"data five","pass5"}};
	//return var1;
	
	//System.out.println("output:"+var1[0][1]);
	
	
	//return new Object[][] {{"data one"},{"data two"},{"data three"},{"data four"},{"data five"}};
	
	return new Object[][] {
		{"use1","pass1"},
		{"use2","pass2"},
		{"use3","pass3"},
		{"use4","pass4"},
		{"use5","pass5"}
		};
}

@DataProvider
public static Object[][] dataProviderMethod2()
{
	return new Object[][] {
		{"name1","phone1"},
		{"name2","phone2"},
		{"name3","phone3"}
	};
}
}
