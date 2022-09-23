package com.java.class17;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		
		int sum = add(10, 20);
		System.out.println(sum);

	}

	static int add(int a, int b) {
		int result = a + b;
		return result;

	}

}
