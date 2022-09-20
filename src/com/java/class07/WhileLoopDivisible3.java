package com.java.class07;

public class WhileLoopDivisible3 {

	public static void main(String[] args) {
		int a = 10;

		while (a >= 0) {
			if (a % 3 == 0) {
				System.out.println(a);
			}
			a--;
		}

	}

}
