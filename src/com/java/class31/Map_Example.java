package com.java.class31;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Example {

	public static void main(String[] args) {
		
		Map<String, String> country = new HashMap <String ,String>();
		
		
		// adding to Keys and Values
		country.put("India", "Delhi");
		country.put("Usa", "Washington");
		country.put("UK", "London");
		country.put("Japan", "Tokyo");
		country.put("China", "Beijing");
		country.put("India", "Mumbai");  // when you try to use duplicate key , it return override the value so = Mumbai
		country.put(null, null);  // HashMap allow us null key and null value
		country.put(null, "xyz"); //override xyz value
		
		// Access to values
		
		System.out.println(country);  // {Usa=Washington, UK=London, Japan=Tokyo, China=Beijing, India=Delhi}
		System.out.println(country.get("India")); // Delhi
		
		// Traverse in HashMap
		
		// creating to Set by using .keyset() also Set does not allow duplicate values
		Set<String> allKey = country.keySet();
		
		for(String key : allKey) {
			System.out.println(key + "="+ country.get(key));
		}
		
		//remove the value and key
		country.remove("India");
		System.out.println(country);
		
		//boolean value
		System.out.println(country.containsKey("India"));  //false

		
	}

}
