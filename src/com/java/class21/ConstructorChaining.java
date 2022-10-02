package com.java.class21;

class A {
	A() {
		System.out.println("from A");
	}
}

class B extends A {   //parent =A  , child= B 
	B() {
		System.out.println("from B");

	}
}

class C extends B{	//parent =B  , child= C
	C(int num) {
		System.out.println("from C");

	}
}

public class ConstructorChaining {

	public static void main(String[] args) {

		C c = new C(10);

	}

}
