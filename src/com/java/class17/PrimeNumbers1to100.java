package com.java.class17;

public class PrimeNumbers1to100 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if (isPrime(i) == true)
				System.out.println(i);
		}

	}

	static boolean isPrime(int num) {

		int divisior = 0;

		for (int i = 2; i < num; i++) {
			if ((num % i == 0)) {
				divisior++;

			}

		}
		if (divisior == 0) {
			return true;
		} else {
			return false;
		}

	}

}
