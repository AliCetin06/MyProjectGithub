package com.java.class20;

public class Lab24 {

	static boolean isLengthCorrect(String word) {
		if (word.length() == 10) {  // all String class  has some feature like length
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		String st = "Sprinters!";
		System.out.println("Length of the string is 10: " + isLengthCorrect(st));

	}

}
