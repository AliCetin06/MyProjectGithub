package com.java.class29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(12);
		numbers.add(456);
		numbers.add(1);
		numbers.add(-3);
		numbers.add(4678);

		Collections.reverse(numbers);   // reverse all members in ArrayList
		Collections.sort(numbers); 		// sorting numbers from small to big number
		Collections.sort(numbers, Collections.reverseOrder());  // sorting numbers from big number to small number

		System.out.println(numbers);

	}

}
