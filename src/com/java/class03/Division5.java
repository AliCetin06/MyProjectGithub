package com.java.class03;

import java.util.Scanner;

public class Division5 {

	public static void main(String[] args) {
		
		System.out.println("Please a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if ( num %5  == 0) {
			System.out.println(num+ " is the divisble to 5");
		}else {
			System.out.println(num+ " is NOT the divisble to 5");
		}


	}

}
