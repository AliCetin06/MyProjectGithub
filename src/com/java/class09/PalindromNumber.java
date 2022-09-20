package com.java.class09;

public class PalindromNumber {

	public static void main(String[] args) {
		int num = 121;

		int originalNum = num;

		int lastDigit;

		int reverseNumber = 0;

		while (num != 0) {
			lastDigit = num % 10;
			num = num / 10; // removing last digit

			reverseNumber = reverseNumber * 10 + lastDigit;
			// getting to reverseNumber
		}
		System.out.println(originalNum);
		System.out.println(reverseNumber);

		if (originalNum == reverseNumber) {
			System.out.println(originalNum + " is a palindrom number");
		} else {
			System.out.println(originalNum + " is not a palindrom number");
		}

	}

}
