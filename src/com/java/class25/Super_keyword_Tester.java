package com.java.class25;

public class Super_keyword_Tester {

	public static void main(String[] args) {

		ChildOfSuper c = new ChildOfSuper();
		c.method6();

	}
}

class Super_keyword {

	int age;

	Super_keyword() {
		System.out.println("parent 1. constructor");
	}

	Super_keyword(int age) {
		System.out.println("parent 2. constructor");

	}

	public void method3() {
		this.age = 30; // update instance value (class level)

		System.out.println("from method4");

	}

	public void method4() {
		System.out.println("from method4");
	}

}

class ChildOfSuper extends Super_keyword {

	ChildOfSuper() {
		super(1000); // calling 2. constructor of parent
		System.out.println("child constructor");
	}

	public void method5() {

		method6();

	}

	public void method6() {
		super.age = 45; // update instance variable of parent class
		System.out.println(age); // 45

		super.method3();
		System.out.println(age); // 30 from parent instance variable
		System.out.println("from child");
	}

}
