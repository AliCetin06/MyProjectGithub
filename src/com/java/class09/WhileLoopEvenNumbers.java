package com.java.class09;

public class WhileLoopEvenNumbers {

	public static void main(String[] args) {

		// calculating even number from 10 to 0
		int i = 10;

		while (i > 0) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i--;
		}

	}

}
