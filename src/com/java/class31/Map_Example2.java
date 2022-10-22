package com.java.class31;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Example2 {

	public static void main(String[] args) {
		Map<Integer, Integer> square = new HashMap <Integer ,Integer>();
		
		square.put(1, 1);
		square.put(2, 4);
		square.put(3, 9);
		square.put(4, 16);
		square.put(5, 25);
		
		Set<Integer> allKeys = square.keySet();
		
		for(Integer key : allKeys) {
			System.out.println(key +"`s square = " +square.get(key));
			
			// traverse by entry set  ,printing each line
			
		}
			
			Set<Entry<Integer, Integer>> entry = square.entrySet();
			
			for (Entry<Integer, Integer> i : entry) {
				System.out.print(i.getKey()+ "---->"); // set of keys
				System.out.println(i.getValue());  // set of values
				
				
			}
		}
		

	}


