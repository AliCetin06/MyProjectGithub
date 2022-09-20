package com.java.class13;

public class FindOutDivisiorOfNumber {

	public static void main(String[] args) {
		
		// divisor of that number
		
		int  num=12;
		
		for (int i= 1; i<=12 ; i++) {
			if ( num % i ==0 ) {
				System.out.println(i);
			}
		}

	}

}
