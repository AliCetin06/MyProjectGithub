package com.java.class13;

public class NumberContainsCheck {

	public static void main(String[] args) {

		// finding to a variable in array using by forEach loop

		int[] data = { 12, 43, 56, 32, 67, 23, 65, 35 };

		int num1 = 23;

		boolean flag = true;

		for (int num2 : data) {

			if (num1 == num2) {

				flag = false; // Checking to excecution
				System.out.println(num1 + " inside in array");
				break;
			}

		}
		if (flag == true) {
			System.out.println(num1 + " not inside in array");
		}

	}

}
