package com.java.class10;

public class NestedLoopPattern9 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // row account

			for (int s = 1; s <= 5 - i; s++) { // creating spaces
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) { // column account

				System.out.print(j);
			}

			for (int j = 1; j < i; j++) {// column account

				System.out.print(j);
			}
			System.out.println(); // jumping from 1.row to 2. row ( press enter)
		}


	}

}
/*
 
    1
   121
  12312
 1234123
123451234

*/
