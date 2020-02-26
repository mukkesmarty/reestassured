package com.knoldus.restassured;

public class ConstructorDemo {
	int a,b;
	int c,d,e;
	//Parameterized constructor
	ConstructorDemo(int a, int b){
		this.a = a;
		this.b = b ;
		System.out.println("Inside parametrized constructor");
	}
	
	//Default constructor
		ConstructorDemo(int c, int d, int e){
			
			this(12,18);
			
			this.c = c;
			this.d = d;
			this.e = e;
			//System.out.println("Inside default constructor");
			//a = 10;
			//b = 20;
			
		}
	
	public static void main(String args[]) {
		ConstructorDemo obj1 = new ConstructorDemo(10,10,10);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
		System.out.println(obj1.d);
		System.out.println(obj1.e);
		
	}
}
