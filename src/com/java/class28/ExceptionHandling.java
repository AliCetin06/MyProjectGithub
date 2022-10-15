package com.java.class28;

public class ExceptionHandling {

	public static void divideByzero() {
		int divideByZero = 5 / 0;
		throw new ArithmeticException("Trying to divide by 0");

	}

	public static void main(String[] args) {

		try {
			divideByzero();
		} catch (ArithmeticException e) {
			System.out.println("Dividing by zero is not permitted");
		} finally {
			System.out.println("Division is fun!");
		}

	}

}
