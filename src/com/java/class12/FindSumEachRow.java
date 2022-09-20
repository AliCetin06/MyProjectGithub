package com.java.class12;

public class FindSumEachRow {

	public static void main(String[] args) {
		int[][] data = { { 12, 54, 51, 14 }, { 93, 23, 43, 20 }, { 9, 3, 6, 1 } };

		int firstRow = 0;
		int secondRow = 0;
		int thirdRow = 0;

		for (int i = 0; i < data.length; i++) {        // traveling in row
			for (int j = 0; j < data[i].length; j++) { // traveling in column
				if (data[0][j] == data[i][j]) {
					firstRow = firstRow + data[0][j];
				}
				if (data[1][j] == data[i][j]) {
					secondRow = secondRow + data[1][j];
				}
				if (data[2][j] == data[i][j]) {
					thirdRow = thirdRow + data[2][j];
				}

			}

		}
		System.out.println("sum of row1:" + firstRow);
		System.out.println("sum of row2:" + secondRow);
		System.out.println("sum of row3:" + thirdRow);
	}

}
