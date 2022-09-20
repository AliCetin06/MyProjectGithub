package com.java.class07;

public class DoWhileLoop {

	public static void main(String[] args) {
		int a = 1;
		
		do {
			System.out.println(a);  // 1,2,3----9
			a++;
		}while ( a< 10);
		System.out.println(a);  // outside of loop so a=10 
	}

}
