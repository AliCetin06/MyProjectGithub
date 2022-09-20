package com.java.class13;

public class SequenceOfChar {

	public static void main(String[] args) {
		String str = "The history of New York begins around" + " 10,000 B.C. when the first people arrived."
				+ " By 1100 A.D. two main cultures had become dominant as the Iroquoian and Algonquian developed";

		char listOfChar[] = str.toCharArray();

		char character1 = 'a';
		char character2 = 'A';
		int total = 0;

		for (char c : listOfChar) {
			if (c == character1 || c == character2) {
				total++;
			}
		}
		System.out.println("total character of a and A : " + total);

		// Second way

		int frequency = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) == 'a') {
				frequency++;
			}
		}
		System.out.println("total character of a and A : " + frequency);

	}

}
