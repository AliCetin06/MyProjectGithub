package com.java.class05;

public class FindingMaxValue {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 15;

		if (a > b && a > c) {
			System.out.println(a + " is biggest number");
		} else if (b > a && b > c) {
			System.out.println(b + " is biggest number");
		} else {
			System.out.println(c + " is biggest number");
		}

	}

}
