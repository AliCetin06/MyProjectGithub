package com.java.class06;

public class SwithStatement_Mouth {

	public static void main(String[] args) {
		int month = 2;

		switch (month) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:

			System.out.println("This month`s 31");
			break;

		case 2:
			System.out.println("This month`s 28");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("This month`s 30");
			break;

		default:
			System.out.println("Enter the valid input beween 1-12");

		}

	}

}
