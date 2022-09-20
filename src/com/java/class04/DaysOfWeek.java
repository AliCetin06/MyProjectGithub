package com.java.class04;

import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {
		System.out.print("Please enter a number between 1-7: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if (i == 1) {
			System.out.println("1- Monday");
		} else if (i == 2) {
			System.out.println("2- Tuesday");
		} else if (i == 3) {
			System.out.println("3- Wednesday");
		} else if (i == 4) {
			System.out.println("4- Thursday");
		} else if (i == 5) {
			System.out.println("5- Friday");
		} else if (i == 6) {
			System.out.println("6- Saturday");
		} else if (i == 7) {
			System.out.println("7- Sunday");
		} else {
			System.out.println("invalid character or number");
		}

	}

}
