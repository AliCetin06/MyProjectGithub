package com.java.class11;

public class SumOfArrayElement {

	public static void main(String[] args) {

		int[] salary = { 121, 643, 752, 264, 243, 754, 234, 745, 23, 234 };

		int sum = 0;
		for (int i = 0; i < salary.length; i++) {

			sum += salary[i];  // same as sum = sum + salary[i]

		}
		System.out.println("Sum of array element: "+ sum);
		System.out.println("Average of array element: "+ sum/ salary.length);
	}

}
