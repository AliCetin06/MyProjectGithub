package com.java.class31;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Example3 {

	public static void main(String[] args) {
		
		Map<String,String> employee = new HashMap<String,String>();
		
		employee.put("userId",  "Cetina");
		employee.put("jobTitleName",  "Automation Engineer");
		employee.put("firstName",  "Ali");
		employee.put("lastName",  "Cetin");
		employee.put("prefferedFullName",  "Ali Cetin");
		employee.put("employeeCode",  "E-0002");
		employee.put("region",  "CO");
		employee.put("phoneNumber",  "123123");
		employee.put("emailAddress",  "abc@gmail.com");
		
		// set view of map = all keys and values in set
		Set setView = employee.entrySet();
		System.out.println("Set view of the map: "+ setView );
		System.out.println();
		
		// collection view of the map = just the values
		System.out.println("collection view of the map: "+ employee.values());
		System.out.println();
		
		//keyView of Map = just the keys
		Set keyView = employee.keySet() ;
		System.out.println("keyView of Map: "+ keyView);
		System.out.println();
		
		//print the map
		System.out.println("The original map: "+ employee);
		System.out.println();
		
		// create a new map by using clone method
		
		HashMap<String,String> newHashMap = new HashMap<String,String>();
		newHashMap =  (HashMap<String, String>) ((HashMap) employee).clone();   // casting
		System.out.println("The cloned map: "+newHashMap );
		
		
		
		

		
	}

}
