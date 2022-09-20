package com.java.class05;

public class LogicalOperators {

	public static void main(String[] args) {
		boolean b1 = true, b2 = false, b3 = true, b4 = false, result1, result2;

		// and is higher priority so do first and then do or operation

		result1 = b1 && b2 && b3 || b2 || b3 && b2 || b2 && b1 && b2;
		result2 = (b1 || b2) && b4 || b4 && b3 && (b2 || b1);

		System.out.println(result1);
		System.out.println(result2);
	}

}
