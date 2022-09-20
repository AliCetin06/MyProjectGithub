package com.java.class13;

public class FibonacciiSeries {

	public static void main(String[] args) {
		// fibonacci series by limit
		
		int num1 = 0;
		int num2 = 1;
		int sum = num1 + num2;
		int limit = 30;

		while (sum <= 30) {
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
		}

	}

}
