package com.java.class10;

public class NestedLoopPattern4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // row account

			for (int j = 1; j <= i; j++) { // column account

				System.out.print(j);
			}
			System.out.println(); // jumping from 1.row to 2. row ( press enter)

		}

	}

}

/*
 
1
12
123
1234
12345

*/