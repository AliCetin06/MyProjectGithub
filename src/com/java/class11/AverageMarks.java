package com.java.class11;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {

		// take 5 students marks from user and try to find out
		// average marks

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int average;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Please enter grades:");
			sum = sum + sc.nextInt();

		}
		average = sum / 5;
		System.out.println("average of these grades: " + average);

	}

}
