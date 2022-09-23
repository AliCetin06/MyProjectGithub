package com.java.class17;

public class PerfectNumberfrom1to500 {

	public static void main(String[] args) {

		for (int i = 1; i <= 500; i++) {
			if (isPerfect(i) == true) {
				System.out.println(i);
			}
		}

	}

	static boolean isPerfect(int num) {

		int sum = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;

			}
		}

		if (num == sum) {

			return true;

		} else {
			return false;

		}

	}

}
