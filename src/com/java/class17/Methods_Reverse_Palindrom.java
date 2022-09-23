package com.java.class17;

import java.util.Scanner;

public class Methods_Reverse_Palindrom {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.print("Please enter a number: ");
		int num2 = sc.nextInt();

		System.out.println("reverse of this number: " + getReverseNumber(num2));

		if (num2 == getReverseNumber(num2)) {
			System.out.println(num2 + " is a palindrom number");
		} else {
			System.out.println(num2 + " is not a palindrom number");
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
