package com.knoldus.restassured;

public class VariableScopeDemo {
	int a = 20;
	
	public void demo1() 
	{
	int a=10;
	int b=20;
/*	for( int a=0,b=90;a>0;a--) 
		{
			System.out.println("Hi i am in loop :: "+a);
		}
		System.out.println("After loop:: "+ a);
		*/

	/*{
		//int b =0;
		int a=45;
		System.out.println(a);
		System.out.println(b);
		
	}*/
	}
	
	
	
	//awgeawawaw
	 //a=10000000;
	/////
	public void demo2() 
	{
		for(;;) 
		{
			
		}
	}
	
	public static void main(String[] args) 
	{
		VariableScopeDemo obj1 = new VariableScopeDemo();
		obj1.demo1();
	}
}
