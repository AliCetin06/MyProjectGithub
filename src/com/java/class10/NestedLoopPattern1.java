package com.java.class10;

public class NestedLoopPattern1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // row account

			for (int j = 1; j <= 3; j++) { // column account
				
				System.out.print("* ");
			}
			System.out.println(); // jumping from 1.row to 2. row ( press enter)

		}

	}
}

/*

* * * 
* * * 
* * * 
* * * 
* * * 


*/