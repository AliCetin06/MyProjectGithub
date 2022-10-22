package com.java.class31;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Example4 {

	public static void main(String[] args) {
		Map<String, Double> grocery = new HashMap<String, Double>();

		grocery.put("Onion", 30.5);
		grocery.put("Potatoes", 40.5);
		grocery.put("Tomatoes", 50.0);
		grocery.put("Canola Oil", 99.99);

		// print the map
		System.out.println("Grocery: " + grocery);
		System.out.println();

		// checking the grocery empty
		System.out.println(grocery.isEmpty());
		System.out.println();

		
		
		// price of Potatoes
		System.out.println("Price of Potatoes: "+ grocery.get("Potatoes"));
		System.out.println();

		
		//remove the potatoes from grocery
		grocery.remove("Potatoes");
		System.out.println("new grocery: "+grocery);
		System.out.println();

		
		//printing total no of items in grocery
		System.out.println("total no of items in grocery: "+ grocery.size());
		System.out.println();


	}
}
