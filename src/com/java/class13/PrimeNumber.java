package com.java.class13;

public class PrimeNumber {

	public static void main(String[] args) {

		// finding to prime number

		int num = 13;
		int divisor = 0;
		boolean flag = false;

		for (int i = 1; i <= num; i++) {
			if ((num % i == 0)) {
				divisor++;
			}

		}
		if (divisor == 2) { // total 2 divisor in prime number
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

		// second way for program

		for (int i = 2; i < num; i++) {
			if ((num % i == 0)) {
				flag = true; // checking to if condition excatued least 1 time
				System.out.println("not prime");
				break;
			}

		}
		if (flag == false) {
			System.out.println("prime");

		}

	}

}
