package com.java.class09;

public class ForLoopPattern3 {

	public static void main(String[] args) {
		// pattern: 1/2 + 2/3 + 3/4 +4/5 +......10/11

		double sum = 0;
		for (double i = 1; i <= 10; i++) {
			sum = sum + i / (i + 1);

		}
		System.out.println(sum);

	}

}
