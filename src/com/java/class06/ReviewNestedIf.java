package com.java.class06;

public class ReviewNestedIf {

	public static void main(String[] args) {
		int a = 10, b = 15;

		if (a > b) {
			System.out.println("A is bigger");
		} else if (a == b) {
			System.out.println("Both are same");
		} else {
			System.out.println("A is smaller");

			if (b > a) {
				System.out.println("B is bigger");
			} else {
				System.out.println("B is smaller");
			}
		}

	}

}
