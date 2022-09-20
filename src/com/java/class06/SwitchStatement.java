package com.java.class06;

public class SwitchStatement {

	public static void main(String[] args) {
		int num = 3;

		switch (num) {

		case 2:
			System.out.println("inside case 2");
			break;

		default:
			System.out.println("Please enter valid input between 1-4");

		case 3:
			System.out.println("inside case 3");
			break; // break says that jump from here to outside of switch statement
					// if there is no break , it will excauted all way down from here
		case 4:
			System.out.println("inside case 4");
			break;

		case 1:
			System.out.println("inside case 1");
			break;

		}

	}

}
