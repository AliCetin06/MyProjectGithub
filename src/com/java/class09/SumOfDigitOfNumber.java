package com.java.class09;

import java.util.Scanner;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {

		System.out.print("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		int lastDigit;
		int sum = 0;
		int num = sc.nextInt();
		
		while (num != 0) {
			lastDigit = num % 10;
			sum = sum + lastDigit;
			num = num / 10;

		}
		System.out.println("Sum Of Digit Of Number: " + sum);

	}

}
