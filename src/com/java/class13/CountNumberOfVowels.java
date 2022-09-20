package com.java.class13;

public class CountNumberOfVowels {

	public static void main(String[] args) {
		String str = "The history of New York begins around" + " 10,000 B.C. when the first people arrived."
				+ " By 1100 A.D. two main cultures had become dominant as the Iroquoian and Algonquian developed";

		char[] listOfChar = str.toLowerCase().toCharArray();
		
		
		int vowelCounter = 0;

		for (int i = 0; i < str.length(); i++) {

			if (listOfChar[i] == 'a' || listOfChar[i] == 'e' || listOfChar[i] == 'i' || listOfChar[i] == 'o'
					|| listOfChar[i] == 'u') {
				vowelCounter++;
			}
		}
		System.out.println("total vowels in string: " + vowelCounter);
		
		
		// removing space from string
		System.out.println(str.replace(" ", ""));
	}

}
