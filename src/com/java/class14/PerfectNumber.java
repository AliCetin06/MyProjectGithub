package com.java.class14;

public class PerfectNumber {

	public static void main(String[] args) {

		// Perfect number ---> num = total divisor

		int num = 28;
		int sum = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;

			}
		}

		if (num == sum) {
			System.out.println(num + " is a perfect number");
		} else {
			System.out.println(num + " is not a perfect number");
		}

	}

}
