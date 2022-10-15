package com.java.class28;

//Exception propagation : An exception is first thrown from the top of the stack and if it is not caught, 
//it drops down the call stack to the previous method.

class ExceptionPropogation {
	void m() {
		int data = 50 / 0; // unchecked exception occurred
		// exception propagated to n()
	}

	void n() {
		m();
		// exception propagated to p()
	}

	void p() {
		try {
			n(); // exception handled
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
	}

	public static void main(String[] args) {

		ExceptionPropogation obj = new ExceptionPropogation();
		obj.p();
		System.out.println("Normal flow...");

	}
}
