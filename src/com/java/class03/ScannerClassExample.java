package com.java.class03;

import java.util.Scanner;

public class ScannerClassExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		String str = sc.nextLine();
		System.out.println(str + " is a string" );
		
		if ( num % 2 == 0) {
			System.out.println(num+ " is a even number");
		}else {
			System.out.println(num+ " is a odd number");
		}

		

	}

}
