package com.java.class06;

import java.util.Scanner;

public class SwitchStatement_Grade {

	public static void main(String[] args) {

		String message;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your grade: ");
		char grade = sc.next().charAt(0); // first character on message
		sc.close();

		switch (grade) {

		case 'A':
			message = "Excellent job!";
			break;
		case 'B':
			message = "Great job!";
			break;
		case 'C':
			message = "Good job!";
			break;
		case 'D':
			message = "You need to work a bit harder job!";
			break;
		case 'F':
			message = "Excellent job!";
			break;
		default:
			message = "Excellent job!";
			break;

		}

		System.out.println(message);

	}

}
