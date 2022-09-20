package com.java.class12;

public class SparseMatrix {

	public static void main(String[] args) {

		int[][] data = { { 2, 0, 0 }, { 0, 4, 0 }, { 0, 0, 6 } };

		int rowLength = data.length;
		int column = data[0].length;
		int size = rowLength * column;

		int zeros = 0;
		int nonzeros = 0;

		for (int i = 0; i < data.length; i++) { // traveling in row
			for (int j = 0; j < data[i].length; j++) { // traveling in column
				if (data[i][j] == 0) {
					zeros++;

				}

			}

		}
		if (zeros > size / 2) {
			System.out.println("Given matrix is a sparse matrix");
		} else {
			System.out.println("Given matrix is not a sparse matrix");
		}

	}

}
