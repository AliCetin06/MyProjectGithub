package com.java.class29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	
	// Iterator is like pointer , it is also a Interface

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(12);
		numbers.add(456);
		numbers.add(1);
		numbers.add(-3);
		numbers.add(4678);
		
		// 1. way to print of all element
		
		for(Integer i : numbers) {
			System.out.println(i);
		}
		System.out.println("--------");
		
		// 2. way to print of all element

		Iterator<Integer>iterator = numbers.iterator();
		System.out.println(iterator.hasNext());  // true , Do you have next element?
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());  // printing all element
		}

	}

}
