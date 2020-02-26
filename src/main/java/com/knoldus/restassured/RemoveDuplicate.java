package com.knoldus.restassured;

import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String[] args) 
	{
		System.out.println("enter the string:");
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		String temp = "";
		for(int i=0; i < string1.length(); i++) 
		{
			if(temp.indexOf(string1.charAt(i)) == -1) 
			{
				temp = temp + string1.charAt(i);
			}
		}
		System.out.println(temp);
		RemoveDuplicate rmobj = new RemoveDuplicate();
		rmobj.disp();
		rmobj.disp2();
	}
	
	public void disp() 
	{   
		        System.out.println(10 * 20 + "Javatpoint");   
		        System.out.println("Javatpoint" + 10 * 20);  	     
	}
	
	public void disp2() 
	{
		{  
	        System.out.println(10 + 20 + "Javatpoint");   
	        System.out.println("Javatpoint" + 10 + 20);  
	    }  
	}

}
