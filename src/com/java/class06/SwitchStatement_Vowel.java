package com.java.class06;

public class SwitchStatement_Vowel {

	public static void main(String[] args) {
		char c = 'X';
		
		switch (c) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c + " is a vowel character");
			break;

		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(c + " is a vowel character");
			break;
			
		default:
			System.out.println(c + " is not a vowel character");
			break;
			
		}

	}

}
