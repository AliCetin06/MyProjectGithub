package com.java.class21;
/*
 
 
class A {
	A() {
		System.out.println("from A");
	}
}

class B extends A { // parent =A , child= B
	B(String st) {
		System.out.println("from B");

	}
}

class C extends B { // parent =B , child= C
	C(int num) {
		System.out.println("from C");

	}
}

public class ConstructorChaining2 {

	public static void main(String[] args) {

		C c = new C(10);

	}


}

There is an  ambiguity here because java can able to choose 
which one will choose
So, parent class`s arguments are problem
to solve this we use super(); 


*/