package com.java.class09;

public class ForLoopPattern2 {

	public static void main(String[] args) {
		// Pattern: 1+2-3+4+5-6+7+8-9+10

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 != 0) {
				sum = sum + i;
			} else {
				sum = sum - i;
			}

		}
		System.out.println(sum);
	}

}
