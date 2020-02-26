package com.knoldus.restassured;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {

	public void arrayListDemo() {
		System.out.println("Hi This is arrayListDemo Method");
		ArrayList list = new ArrayList();
				list.add(10);
				list.add(10.10);
				list.add('M');
				list.add("Mukesh");
				//list.add("mukesh","kumar","java");
				
				Iterator itr = list.iterator();
				
				while(itr.hasNext()) {		
				System.out.println(itr.next());
				}				
	}

	
	public static void main(String args[]) {
		CollectionDemo collectiondemo = new CollectionDemo();
		collectiondemo.arrayListDemo();
	}
}
