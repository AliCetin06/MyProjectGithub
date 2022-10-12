package com.java.class25;

public class This_keyword {

	// this keyword using variables , methods and constructors

	static int a = 10; // instance variable ( has to be static to receive in main method )

	int b = 30;

	This_keyword() {
		this(5000); // calling the 2. constructor firstly
		System.out.println("inside 1. constructor");
	}

	This_keyword(int balance) {
		this(2000, "Chirag");// calling the 3. constructor firstly
		System.out.println("inside 2. constructor");
	}

	This_keyword(int balance, String name) {

		System.out.println("inside 3. constructor");
	}

	public static void main(String[] args) {
		This_keyword tk = new This_keyword(5000);

		tk.method1(); // calling to method1

		System.out.println(This_keyword.a); // 10 , refer to instance variable (class level)

	}

	public void method1() {
		int a = 20; // local variable

		this.b = 40; // update instance value (class level)

		System.out.println(a); // 20
		System.out.println(b); // 40

//		method2();   or use this.method(); both are same because both method are instance method 
		this.method2();

	}

	public void method2() {
		System.out.println("from method2");
	}

}
