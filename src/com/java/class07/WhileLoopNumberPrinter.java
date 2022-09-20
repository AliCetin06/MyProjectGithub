package com.java.class07;

import java.util.Scanner;

public class WhileLoopNumberPrinter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your number: ");
		int num;

		while ((num = sc.nextInt()) != 0) { // if you are write this code above , it will be excacuted infinite times
											// because first variable not can not change
			System.out.println("You entered " + num);
			System.out.print("Please enter your number: ");

		}
		System.out.println("you are out of loop because you enter 0");

	}

}
