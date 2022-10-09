package com.java.class24;

public class Wrapper2 {

	public static void main(String[] args) {

		short a = 1;
		int b = 2;
		char c = 'k';
		double d = 12.5;
		boolean e = true;

		// with autoboxing converting object ,wrapper class

		Short sh = a;
		Integer i = b;
		Character ch = c;
		Double dd = d;
		Boolean bl = e;

		// with unboxing converting primitive data type

		System.out.println("short value: " + sh.shortValue());
		System.out.println("integer value: " + i.intValue());
		System.out.println("double value: " + dd.doubleValue());
		System.out.println("character value: " + ch.charValue());
		System.out.println("boolean value: " + bl.booleanValue());

	}

}