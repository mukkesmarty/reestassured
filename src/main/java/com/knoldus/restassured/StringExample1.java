package com.knoldus.restassured;

public class StringExample1 {
public String transform(String s1) {
	String str = s1;
	String[] strarray = str.split(" ", 3);
	//StringBuilder finalst = new StringBuilder();
	
	int day = Integer.valueOf(strarray[0])+1;
	String st2 =  day + " " + strarray[1] + " " + strarray[2];
	return st2;
}	


public static void main(String[] args) {
	StringExample1 obj1 = new StringExample1();
	
	String s1 = "22 november 2018";
	
	String outstr = obj1.transform(s1);
	System.out.println("Hello: "+outstr);
}
}
