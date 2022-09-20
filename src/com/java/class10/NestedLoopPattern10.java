package com.java.class10;

public class NestedLoopPattern10 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // row account

			for (int s = 1; s <= i - 1; s++) { // creating spaces
				System.out.print(" ");
			}

			for (int j = 1; j <= 6 - i; j++) { // column account

				System.out.print(j);
			}

			System.out.println(); // jumping from 1.row to 2. row ( press enter)
		}

	}

}  // do it first without space then do space by relationship

/*
 
 12345
  1234
   123
    12
     1
 
 */
