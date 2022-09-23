package com.java.class17;

public class ReverseOf11to20 {

	public static void main(String[] args) {

		// print reverse of 11 to 20

		for (int i = 11; i <= 20; i++) {
			System.out.println(getReverseNumber(i));
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