package com.java.class11;

public class CountPositiveAndNegativeNumber {

	public static void main(String[] args) {

		int[] data = { 23, -43, 75, 26, -56, 32, -76, 34, -63, 65 };

		int positive = 0;
		int negative = 0;
		int zero = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] >= 0) {

				positive++;

			} else if (data[i] == 0) {
				
				zero++;
				
			} else {
				negative++;
			}

		}
		System.out.println("Total positive in array: " + positive);
		System.out.println("Total negative in array: " + negative);
		System.out.println("Total zero in array: " + zero);

	}

}
