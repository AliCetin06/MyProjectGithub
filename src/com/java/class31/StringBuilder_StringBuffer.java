package com.java.class31;

public class StringBuilder_StringBuffer {

	public static void main(String[] args) {

		// Finding the reverse of string

		String str = "SprintQA";

		char ch[] = str.toCharArray();
		String reverse = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			reverse += ch[i];
		}

		System.out.println("Finding the reverse of string: " + reverse);

		// reverse using by String Builder
		StringBuilder sb = new StringBuilder("SprintQA");
		System.out.println("reverse using by String Builder: " + sb.reverse());
		

		// reverse using by String Buffer

		StringBuffer sb2 = new StringBuffer("SprintQA");
		System.out.println("reverse using by String Buffer: " + sb2.reverse());

	}
}
