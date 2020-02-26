package com.knoldus.restassured;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		System.out.println("Please enter the number to check for Prime No. ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n/2;
		int flag =0;
		//System.out.println(m);
		
		if(n==0 || n==1) 
		{
			System.out.println("Entered No. is  not Prime No. ");
		}
		else
		{
			for(int i=2;i<m;i++) 
			{
				if(n%i==0) 
				{
					System.out.println(n +"Is not prime");
					flag =1;
					break;
				}
				
			}
		
			if(flag==0) 
			{
				System.out.println(n +"is prime");
			}
		}
	}
}
