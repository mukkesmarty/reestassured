package com.knoldus.restassured;

public class ThisDemo { 
	int a,b;
	public ThisDemo(int a, int b)
	{
		this.a = a;
		this.b = b;
		
	}
	
	public static void main(String[] args) {
		ThisDemo obj = new ThisDemo(45,56);
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}
