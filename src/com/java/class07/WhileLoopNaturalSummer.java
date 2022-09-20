package com.java.class07;

public class WhileLoopNaturalSummer {

	public static void main(String[] args) {
		int sum , i ;
		
		sum = 0;
		i = 100;
		
		while ( i != 0) {
			
			sum = sum + i;
			i--;
		}
		System.out.println(sum);

	}

}
