package com.java.class09;

public class ReverseOfNumber {

	public static void main(String[] args) {

		int num = 25567892;

		int lastDigit;

		int reverseNumber = 0;

		while (num != 0) {
			lastDigit = num % 10;
			num = num / 10; // removing last digit

			reverseNumber = reverseNumber * 10 + lastDigit;
			// getting to reverseNumber
		}
		System.out.println(reverseNumber);

	}

}
