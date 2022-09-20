package com.java.class06;

import java.util.Scanner;

public class SwitchStatement_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter 2 numbers: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		int num2 = sc.nextInt();
		sc.nextLine();
		

		System.out.println("Please enter operation(1-add, 2-sub, 3-mult, 4-div): ");
		int opr = sc.nextInt();
		sc.nextLine();

		switch (opr) {

		case 1:
			System.out.println( num1 + num2);
			break;
		case 2:
			System.out.println( num1 - num2);
			break;
		case 3:
			System.out.println( num1 * num2);
			break;
		case 4:
			System.out.println( num1 / num2);
			break;
			
		default :
			System.out.println("Please enter valid operation");
		}

	}

}
