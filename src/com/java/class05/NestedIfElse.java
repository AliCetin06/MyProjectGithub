package com.java.class05;

public class NestedIfElse {

	public static void main(String[] args) {
		int a = 10, b = 42, c = 23;

		if (a > b) {
			if (a > c) {
				System.out.println(a + " is the biggest");
			}
		} else  {
			if (b > c) {
				System.out.println(b + " is the biggest");
			} else {
				System.out.println(c + " is the biggest");
			}
		}

	}

}
