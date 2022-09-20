package com.java.class09;

public class Divisibleof5or3 {

	public static void main(String[] args) {

		// divisible 5 or 3 between 0-50 and sum of these numbers

		int sum = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 5 == 0 || i % 3 == 0) {
				System.out.println(i);

				sum = sum + i;
			}
			
		}
		System.out.println("sum of these numbers: " + sum);


	}

}
