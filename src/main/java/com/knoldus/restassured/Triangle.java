package com.knoldus.restassured;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		System.out.println("enter the no.");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		
		for(int i=0; i<no; i++ ) {
		
			for(int j=no; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<(2*i-1);k++ ) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
