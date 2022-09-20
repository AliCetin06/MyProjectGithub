package com.java.class04;

public class TypeCasting {

	public static void main(String[] args) {
		double d = 10;
		int i = (int) 10.457; // type casting

		System.out.println(i); // 10
		System.out.println(i / 3); // 3
		System.out.println(i / 3.0); // 3.3

		int j = 'c';
		System.out.println(j); // 99 because 99 ascii value of c in memory

		String str = "123";
		// int k = str ; // error because not available from nonprimitive to primitive
		// data type
		// System.out.println(k); // we can use wrapper class to convert other data type

		// boolean b = ( boolean)"true ; not available from nonprimitive to primitive
		// data type

	}

}
