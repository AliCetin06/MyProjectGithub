package com.java.class08;

public class LogicalOperatorsReview {

	public static void main(String[] args) {
		boolean b1 = true , b2 = false, b3 = true , b4 = true;
		
		boolean result  = b1 && b3 && b4 || b2 || b4 && b2 ;
		
		System.out.println(result);
	}

}
