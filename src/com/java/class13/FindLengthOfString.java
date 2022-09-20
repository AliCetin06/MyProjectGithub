package com.java.class13;

public class FindLengthOfString {

	public static void main(String[] args) {

		String str = "This is my first String Program";

		char listOfChar[] = str.toCharArray(); // creating a char array with spaces

		int length = 0;

		for (char c : listOfChar) {

			length++;

		}
		System.out.println("Length of all Strings: " + length);

	}

}
