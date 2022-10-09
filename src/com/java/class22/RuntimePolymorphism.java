package com.java.class22;

class Parent2 {

	public void feature1() {
		System.out.println("f1 from parent");

	}

	public void feature2() {
		System.out.println("f2 from parent");

	}

	public void feature3() {
		System.out.println("f3 from parent");

	}
}

class Child2 extends Parent2 {

	@Override
	public void feature1() {
		System.out.println("f1 from Child");

	}

	@Override
	public void feature2() {
		System.out.println("f2 from Child");

	}

	@Override
	public void feature3() {
		System.out.println("f3 from Child");

	}

	public void feature4() {
		System.out.println("f4 from Child");

	}

	public void feature5() {
		System.out.println("f5 from Child");

	}

}

public class RuntimePolymorphism {
	public static void main(String[] args) {

		// 1. case
		Parent2 p = new Parent2();
		p.feature1(); // f1 from parent

		// 2. case
		Child2 c = new Child2();
		c.feature2(); // f2 from Child
		c.feature4(); // f4 from Child

		// 3. case
		Parent2 pc = new Child2();
		pc.feature2(); // f2 from Child
//		pc.feature4();   // error 

		// 4. case
//		Child2 cp = new Parent2();  // error (compilation)

	}
}
