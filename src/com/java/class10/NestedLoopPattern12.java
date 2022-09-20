package com.java.class10;

public class NestedLoopPattern12 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) { // row account

			for (int s = 1; s <= 5 - i; s++) { // creating spaces
				System.out.print(" ");
			}

			for (int j = 1; j < i; j++) { // column account

				System.out.print(j);
			}

			for (int j = i; j >= 1; j--) {// column account

				System.out.print(j);
			}
			System.out.println(); // jumping from 1.row to 2. row ( press enter)
		}

		for (int i = 1; i <= 5; i++) { // row account

			for (int s = 1; s <= i - 1; s++) { // creating spaces
				System.out.print(" ");
			}

			for (int j = 1; j <= 6 - i; j++) { // column account

				System.out.print(j);
			}
			/*
			 * 1. and 2. loop created this pattern 12345 1234 123 12 1
			 * 
			 */

			for (int j = 5 - i; j >= 1; j--) { // column account

				System.out.print(j);
			}

			/*
			 * last for loop created this pattern 4321 321 21 1
			 */

			System.out.println(); // jumping from 1.row to 2. row ( press enter)
		}

	}

}

/*
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1
 */
