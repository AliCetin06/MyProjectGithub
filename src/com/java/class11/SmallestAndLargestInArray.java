package com.java.class11;

public class SmallestAndLargestInArray {

	public static void main(String[] args) {
		int[] data = { -50, -15, 20, 25, 30, 35, 40 };

		int min = data[0]; // 50
		int max = data[0]; // 50

		for (int i = 0; i < data.length; i++) {

			if (data[i] < min) {
				min = data[i]; // finding min value

			}
			if (data[i] > max) {
				max = data[i]; // finding max value

			}
		}
		System.out.println("Minimum value in array: " + min);
		System.out.println("Maximum value in array: " + max);
	}

}
