package com.java.class22;

public class CalculatorTest extends Calculator {

	public static void main(String[] args) {
		
		// 3. way
		sum(10,20);
		sum(13.4,12.4);
		
		
	}

}

class Calculator {
	
	// method Overloading 

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void sum(double a, double b) {
		System.out.println(a + b);
	}
	public static void sum(String a, String b) {
		System.out.println(a + b);
	}
}

// There are 3 way to access other class method
//1 . by creating object  and access it
//2.  by doing all method static and access by Class name
//3. use extend keyword and do all method as static
