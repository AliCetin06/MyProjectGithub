package com.java.class03;

public class IfElseStatement {

	public static void main(String[] args) {
		
		boolean isTrafficAhead = true;
	
		System.out.println("1. Starting drive");
		
		if ( isTrafficAhead == false) {
			System.out.println("2. Go Straight");
		}else {
			System.out.println("3. Take diversion and take 2nd route");
		}
		System.out.println("4. Destination");
	}

}
