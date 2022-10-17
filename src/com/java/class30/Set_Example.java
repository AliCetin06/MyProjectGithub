package com.java.class30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_Example {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		Set<Integer> setOfNumbers = new HashSet<Integer>();
		
		numbers.add(32);
		numbers.add(4678);
		numbers.add(12);
		numbers.add(45);
		numbers.add(15);
		numbers.add(32);  // List allows to duplicate value ;however set does not allow it
		
		
		setOfNumbers.add(15);
		setOfNumbers.add(32);
		setOfNumbers.add(4678);
		setOfNumbers.add(12);
		setOfNumbers.add(45);
		setOfNumbers.add(4678);
		
		

		System.out.println("===========List Data========");

		for (Integer data : numbers) {
			System.out.println(data);
		}
		
		// It is an unordered collection of data

		System.out.println("===========Set Data=========");

		for (Integer data : setOfNumbers) {
			System.out.println(data);
		}

	}

}
