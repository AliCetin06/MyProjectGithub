package com.java.class29;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

	// create a String ArrayList and print all members
	public static void main(String[] args) {
		// implement from list class object from child ArrayList object
		List<String> list = new ArrayList<String>(); // or use ArrayList<String> list = new ArrayList<String>()

		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");

		for (String i : list) {

			System.out.println(i);

		}

		System.out.println(list.size()); // number of data in ArrayList

		System.out.println(list.isEmpty()); // false

		// convert list to array and try to print all array elements

		System.out.println("Array list -->" + list);

		// parentclass =Object ----> child class = list
		Object[] data = list.toArray();

		for (Object i : data) {

			System.out.println((String) i); // type casting for each element from object to String
											// so it allow us to use all method in string class

		}

		// check array list specific item
		System.out.println(list.contains("aa")); // true

		// ignore the case sensitivity and check list specific item
		for (String s : list) {
			if (s.equalsIgnoreCase("xx")) {
				System.out.println(true);
				break;
			} else {
				System.out.println(false);
				break;
			}

		}

		// index of element in ArrayList
		System.out.println(list.indexOf("bb")); // 1

	}

}