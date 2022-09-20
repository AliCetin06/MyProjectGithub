package com.java.class09;

public class ForLoopPattern4 {

	public static void main(String[] args) {
		// pattern: 10+1+9+2+8+3+7+4+6+5
		
		int sum = 0;
		for (int i = 10; i > 5; i--) {
			sum = sum + i;
			sum = sum + 11 - i;

		}
		System.out.println(sum);
	}

}
