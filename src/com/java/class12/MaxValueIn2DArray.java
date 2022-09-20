package com.java.class12;

public class MaxValueIn2DArray {

	public static void main(String[] args) {
		int[][] data = { { 12, 54, 51, 14 }, { 93, 23, 43, 20 }, { 9, 3, 6, 1 } };
	

		int min = data[0][0];
		int max = data[0][0];

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {

				if (data[i][j] < min) {  // finding min
					min = data[i][j];
				}
				if (data[i][j] > max ) {  // finding max
					max = data[i][j];
				}

			}
		}
		System.out.println("Minimum value in array: " + min);
		System.out.println("Maximum value in array: " + max);

	}

}
