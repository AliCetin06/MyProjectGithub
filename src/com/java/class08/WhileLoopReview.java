package com.java.class08;

public class WhileLoopReview {

	public static void main(String[] args) {

		// divided 5 reminder 4 , divided 4 reminder 3
		// divided 3 reminder 2 ,divided 2 reminder 1,

		int i = 1;

		while (i <= 100) {
			if ((i % 5 == 4) && (i % 4 == 3) && (i % 3 == 2) && (i % 2 == 1)) {
				System.out.println(i);
			}
			i++;
		}

	}

}

