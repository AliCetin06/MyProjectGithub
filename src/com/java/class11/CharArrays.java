package com.java.class11;

public class CharArrays {

	public static void main(String[] args) {
		char[] alphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
/*
		System.out.print(alphabets[0]);
		System.out.print(alphabets[11]);
		System.out.print(alphabets[8]);
*/
		
		// how to write ali ????????
		for (int i = 0; i < alphabets.length; i++) {
			if (alphabets[i] == 'a') {
				System.out.print("a");
			}  if (alphabets[i] == 'l') {
				System.out.print("l");
			}  if (alphabets[i] == 'i') {
				System.out.print("i");
			}
		}
	}

}
