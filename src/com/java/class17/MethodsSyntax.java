package com.java.class17;

import java.util.Scanner;

public class MethodsSyntax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		printLine(25, '*'); // calling to method 25 times
		System.out.print("Please enter number : ");
		int num1 = sc.nextInt();
		printLine(50, '='); // calling to method 50 times
		System.out.println("You entered " + num1);
		printLine(25, '='); // calling to method 25 times

	}
	
	// 1.argument= how many times works method
	// 2.argument= which symbol use in method

	static void printLine(int lengthOfLine, char symbol) {
		
		for (int i = 1; i <= lengthOfLine; i++) {
			System.out.print(symbol);
		}
		System.out.println(); // enter , nextline
	}
	

}
