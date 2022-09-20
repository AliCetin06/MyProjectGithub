package com.java.class04;

import java.util.Scanner;

public class MarksOnExam {

	public static void main(String[] args) {
		System.out.print("Please enter a your grade: ");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();

		if (marks > 100) {
			System.out.println("Invalid Input");
		} else if (marks >= 90) {
			System.out.println("A+");
		} else if (marks >= 80) {
			System.out.println("A");
		} else if (marks >= 70) {
			System.out.println("B");
		} else if (marks >= 60) {
			System.out.println("C");
		} else if (marks >= 50) {
			System.out.println("D");
		} else if (marks >= 40) {
			System.out.println("E");
		} else if (marks >= 0) {
			System.out.println("Fail");
		} else {
			System.out.println("invalid input");
		}

	}

}
