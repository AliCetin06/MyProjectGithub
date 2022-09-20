package com.java.class13;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {

		// 1. Checking equality (value)

		String str1 = "      hello      ";
		String str2 = "Hello";
		String str3 = "Welcome Ali! Hello? How are you? Here is your $200";
		String str4 = ""; // empty string
		String str5 = "USD 200";

		System.out.println(str1.equals(str2)); // output: false

		// 2. Checking equality ignoring case input: hello
		System.out.println(str1.equalsIgnoreCase(str2)); // output: true

		// 3. Checking one big string contains another small string
		System.out.println(str3.contains(str2)); // output: true

		// 4. Changing upper case
		System.out.println(str3.toUpperCase()); // WELCOME ALI! HELLO? HOW ARE YOU?

		// 5. Changing lower case
		System.out.println(str3.toLowerCase()); // welcome ali! hello? how are you?

		// 6. Checking one big string contains another small string
		// ignoring case --> first convert to same case then compare two string
		System.out.println(str3.toLowerCase().contains(str1.toLowerCase())); // true

		// 7. Getting position of string or char in given string ,first index
		System.out.println(str3.indexOf("Ali")); // 8

		// 8. Getting char at given position
		System.out.println(str3.charAt(8)); // A

		// 9. Checking String is empty or not
		System.out.println(str1.isEmpty()); // false

		// 10. Length of string
		System.out.println(str3.length()); // 32

		// 11. Replace String
		System.out.println(str3.replace("Ali", "Mehmet")); // Welcome Mehmet! Hello? How are you?
		// removing space from string
		System.out.println(str3.replace(" ", ""));

		// 12. Replace String with All character
		// Getting to special characters or remove characters
		System.out.println(str3.replaceAll("[a-z A-Z]", "")); // !??$200
		System.out.println(str3.replaceAll("[^a-z A-Z]", "")); // Welcome Ali Hello How are you Here is your

		// 13. Remove space before and after string
		System.out.println(str1.trim().equalsIgnoreCase(str2)); // true

		// 14. find sub -string
		System.out.println(str5.substring(0, 3));

		// 15. Split by space and question mark

		String listOfStr[] = str3.split(" ");
		System.out.println(listOfStr.length); // show that how many word in array

		for (String word : listOfStr) {
			System.out.println(word); // each word split different line

		}
		String listOfStr2[] = str3.split("\\?");
		for (String word : listOfStr2) {
			System.out.println(word); // each word split different line

		}

		// 16. Format
		String userName = "Chirag";
		String title = "Welcome! %s,%s , How are you?"; // string will be dynamic

		System.out.println(String.format(title, userName , userName));
		
		// 17. toCharArray
		
		char listOfChar [] = str3.toCharArray();
		System.out.println(listOfChar);
		

	}

}
