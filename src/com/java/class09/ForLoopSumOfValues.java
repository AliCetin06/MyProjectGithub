package com.java.class09;

public class ForLoopSumOfValues {

	public static void main(String[] args) {
		
		// sum of 1-10 values and average of these values
		
		int sum = 0;
		
		for(int i=1; i <= 10 ; i++) {
			 sum = sum + i;
			
		}
		System.out.println("sum of values: "+ sum);
		System.out.println("average of values: "+ sum / 10);

	}

}
