package com.java.class12;

public class TwoDimentionArray {

	public static void main(String[] args) {

		// Declaration of array and Initialization of array
		int[][] data = new int[5][4]; // 5 row , 4 column
		
		// Declaration and assign value in same line
		int[][] data2 = { { 12, 54, 51, 14 }, { 93, 23, 43, 20 }, { 9, 3, 6, 1 } }; // 0. , 1. and 2. row

		System.out.println(data2[0][0]);   // 12
		System.out.println(data2.length);  // 3 --> because it gives column amount
		
		System.out.println(data2[1].length); //  4 ---> because it gives elements length that column
											// so row amount
		
		
		// traveling all array
		
		for(int i = 0 ; i< data2.length; i++) {     		// traveling in row
			for(int j = 0 ; j< data2[i].length; j++) {		// traveling in column
				
				System.out.print(data2[i][j]+ " ");
				
			}
			System.out.println();
		}
	}

}
