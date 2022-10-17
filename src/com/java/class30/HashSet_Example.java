package com.java.class30;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// create set of int and store data from user and print duplicate number entered by user , count number of duplicated number
public class HashSet_Example {

	public static void main(String[] args) {
		Set<Integer> setOfNumbers = new HashSet<Integer>();

		Scanner sc = new Scanner(System.in);

		int count = 0;

		for (int i = 0; i < 6; i++) {
			System.out.println("Please enter a number: ");
			int num = sc.nextInt();

			if (setOfNumbers.add(num) == false) {
				System.out.println(num + " is a dublicated number"); // print duplicate number
				count++;
			}
		}
		System.out.println(count + " number is duplicated");
		System.out.println("set-->" + setOfNumbers); // no inside any duplicate number

	}

}
