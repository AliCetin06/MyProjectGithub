package com.java.class04;

import java.util.Scanner;

public class MonthDay {

	public static void main(String[] args) {
		System.out.print("Please enter a number between 1-12: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if (i == 1 || i == 3 || i == 5 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
			System.out.println("This mounth`s 31");
		} else if (i == 2) {
			System.out.println("This mounth`s 28");
		} else {
			System.out.println("This mounth`s 30");
		}

	}

}
