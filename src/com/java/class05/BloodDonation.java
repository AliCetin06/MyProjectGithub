package com.java.class05;

import java.util.Scanner;

public class BloodDonation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("Please enter your weight: ");
		double weight = sc.nextDouble();
		sc.nextLine();

		if (age < 18) {
			System.out.println("You are to young for blood test");
		} else {
			if (weight >= 50) {
				System.out.println("You are qualify for blood test");
			} else {

				System.out.println("Your`s weight is under 50 ");
			}
		}

	}

}
