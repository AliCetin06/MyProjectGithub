package com.java.class30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// converting set to list
public class ConvertFromSetToLits {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>();
		
		//Converting  set---> list
		List<Integer> numList = new ArrayList<Integer>(numbers);  // or use numbers.addAll(numbers);
		
	
		
		numbers.add(98);
		numbers.add(34);
		numbers.add(45);
		numbers.add(12);
		
		

	}

}
