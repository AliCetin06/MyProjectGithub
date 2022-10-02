package com.java.class21;

class X {
	X() {
		System.out.println("from X");
	}

	X(int num) {
		System.out.println("from X with argument");
	}
}

class Y extends X { // parent =X , child= Y
	Y() {
		System.out.println("from Y");
	}

	Y(int num) {
		System.out.println("from Y with argument");

	}
}

class Z extends Y { // parent =Y , child= Z
	Z() {
		super(30);
		System.out.println("from Z");

	}
}

public class ConstructorChaining3 {
	public static void main(String[] args) {

		Z z = new Z();

	}

}

//  OUTPUT
//from X
//from Y with argument
//from Z
