package com.knoldus.restassured;

public class Honda4 extends Bike {
	void run() {
		System.out.println("running safely");
	}
	void stop() {
		System.out.println("stopped safely");
	}
	
	public static void main(String args[]) {
		//Bike obj = new Honda4();
		Honda4 obj = new Honda4();
		obj.run();
		obj.stop();
		Bike bike = new Honda4();
		bike.fun();
	}

}
