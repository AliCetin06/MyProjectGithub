package com.java.class18;

public class AccessModifierTesting {

	public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier();

		//	am.balance = 10000; //  error because we can not access due to private
		
		am.age = 10; // public  , so everywhere can access it
		
		am.name = "Chirag";  // default , so it can access in same package
	}

}
