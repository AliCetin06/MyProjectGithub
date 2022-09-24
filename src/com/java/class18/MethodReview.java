package com.java.class18;

public class MethodReview {

	public static void main(String[] args) {
		
		sum1(10,20);
		sum2(10,20);


	}
	
	// changing to parameter count
	
	static void sum1 (int a , int b) {
		System.out.println(a+b);
	}
	static int sum1 (int i , int j ,int k) {
		return i +j+ k ;
	}
	
	// changing to  type of parameter 
	
	static void sum2 (int a , int b) {
		System.out.println(a+b);
	}
	
	
	static double sum2 (double a , double b) {
		return a +b ;
	}
	

}
