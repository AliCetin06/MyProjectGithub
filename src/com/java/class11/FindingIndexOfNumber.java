package com.java.class11;

public class FindingIndexOfNumber {

	public static void main(String[] args) {
		int[] salary = { 121, 643, 752, 264, 243, 754, 234, 745, 23, 234 };

		int sum = 0;
		int number = 754;

		for (int i = 0; i < salary.length; i++) {

			if (salary[i] == number)
				System.out.println("index of that number: "+ i );
		}

	}

}
