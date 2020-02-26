package com.knoldus.restassured;

public class StringDemo {
	final int a=1;
	static int b;
	static int c;
	static StringDemo obj1 = new StringDemo();
	
	
	public void stringToChar(String arg1) 
	{
		String st = arg1;
		
	}
	
	public void concatDemo() 
	{
		String name1 = "Mukesh1";
		String name2 = "Mukesh2";
		String name3 = "Mukesh3";
		String name4 = new String("Mukesh1");
		StringBuffer name5 = new StringBuffer().append("Mukesh1");
		
		System.out.println(name1+name2+name3);
		System.out.println(name1.concat(name2).concat(name3));
		System.out.println(name1.equals(name4));
		
		System.out.println(name1 == name4);
		//System.out.println(name5.equals(name4));

	}
	
	
	
	static  
	{
		c = 2;
		b = 3;
	}
	
	public static void main(String args[])
	{
		StringDemo obj2 = new StringDemo();
		obj1.stringToChar("mukesh kumar1");
		obj2.stringToChar("mukesh kumar2");
		int z = c+b;
		System.out.println(z);
		
		obj2.concatDemo();
	}

}
