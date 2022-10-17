package com.java.class29;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(50);
		list.add(40);
		list.add(12);
		list.add("Chirag");
		list.add('c');
		list.add(true);

		// some method in ArrayList class

		System.out.println(list.get(2)); // 12
		System.out.println(list.contains(40)); // true
		System.out.println(list.size()); // 3

		// printing all element in ArrayList by for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("---------------------------");

		// create a single data type for ArrayList
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(50);
		list2.add(40);
		list2.add(12);

		// use foreach loop
		for (int i : list2) {
			System.out.println(i);
		}

	}

}
