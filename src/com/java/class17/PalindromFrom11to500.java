package com.java.class17;

public class PalindromFrom11to500 {

	public static void main(String[] args) {

		// printing all palindrom from 11 to 500

		for (int i = 11; i <= 500; i++) {
			if (i == getReverseNumber(i)) {
				System.out.println(i);

			}
		}

	}

	static int getReverseNumber(int num) {
		int reverseNumber = 0;
		int lastDigit;

		while (num != 0) {
			lastDigit = num % 10;
			num = num / 10; // removing last digit

			reverseNumber = reverseNumber * 10 + lastDigit;
			// getting to reverseNumber

		}

		return reverseNumber;

	}

}
