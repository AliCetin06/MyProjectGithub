package com.java.class32;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Example5 {

	// Access the key from value 
	// we don`t have direct method to achieve key so we need to Set to access it
	
	public static void main(String[] args) {
		
		Map<Integer , String> weekDays = new  HashMap<Integer , String>();
		
		weekDays.put(0, "Sunday");
		weekDays.put(1, "Monday");
		weekDays.put(2, "Tuesday");
		weekDays.put(3, "Wednesday");
		weekDays.put(4, "Thursday");
		weekDays.put(5, "Friday");
		weekDays.put(6, "Saturday");
	
		String day = "Friday";
		
		// Create a set from map
		Set<Integer> keys = weekDays.keySet();
		
		
		
		for(Integer key : keys) {
			if (weekDays.get(key).equals(day)) {
				System.out.println(key);  // it gives to key =5
			}
		}
		
		

	}

}
