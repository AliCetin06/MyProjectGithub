package com.java.class24;

public class WrapperClass {
	public static void main(String[] args) {

		String num1 = "10", num2 = "20["; // non-primative data types

		int i = 10, j = 20; // Primitive data type

		Integer a = new Integer(30); // creating a object in integer class

		System.out.println(a.MAX_VALUE); // max value store in integer

		System.out.println(a.compareTo(i)); // 1
		// a >i =1 , a =i =0 , a < i =-1

		System.out.println(Integer.reverse(1234)); // bit level reverse

		System.out.println(Integer.parseInt(num1)); // convert integer from string value

		// 10 + 20
		System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));

		int x = 5;
		Integer y = x; // converting primitive data type to object
						// called auto wrapping

		Integer b = new Integer(j); // converting primitive data type to object
									// called explicitly wrapping

		int k = b; // auto-unwrapping

		int m = b.intValue(); // unwrapping explicitly

	}

}
