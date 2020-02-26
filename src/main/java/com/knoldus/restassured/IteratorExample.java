package com.knoldus.restassured;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.mozilla.javascript.ast.Symbol;

public class IteratorExample {

	public static void main(String[] args) {
		IteratorExample obj1 = new IteratorExample();
		//obj1.arraListMethod();
		obj1.hashMapMethod();
		System.out.println("HELLO"+obj1);
		obj1 = new IteratorExample();
		System.out.println("HELLO2:"+ obj1);
	}
	
	public void arraListMethod() {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("mukesh");
		alist.add("deapak");
		alist.add("nitin");
		alist.add("pankaj");
		alist.add("sumit");
		alist.add("varun");
		
		
		Iterator iterator = alist.iterator();
		System.out.println("Lists elements: ");
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+ " ");	
		}
	}
	
	public void hashMapMethod() {
		HashMap<String,Integer> map = new HashMap();
		map.put("hindi", 61);
		map.put("english", 72);
		map.put("maths", 65);
		map.put("science", 82);
		map.put("computers", 76);
		
		System.out.println(map.values());
		System.out.println(map.keySet());
		
		Set set = map.entrySet();
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
		System.out.println(iterator.next()+ " ");
		}
		
		Map<String,Integer> tmap = new TreeMap<String,Integer>(map);
		System.out.println("After sorting");
		Set set2 = tmap.entrySet();
		Iterator iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next()+ " ");
		}
		
		System.out.println("Now with simple key value accessing");
		//Set set3 = map.entrySet();
		Iterator iterator3 = set2.iterator();
		while(iterator3.hasNext()) {
			Map.Entry mentry2 = (Map.Entry)iterator3.next();
			System.out.print("key is:"+ mentry2.getKey()+" and");
			System.out.println("value is :"+ mentry2.getValue());
		}
		
	}
}
