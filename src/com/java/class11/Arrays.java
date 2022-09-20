package com.java.class11;

public class Arrays {

	public static void main(String[] args) {
		
		// take 60 students from user and try to find
		// average marks
		
		
		// Declaration of array
		int [] studentMarks;
		
		// Initialization of array
		studentMarks =  new int [10];
		
		// Declaration of array and Initialization of array
		int [] salary = new int [100];
		
		// Declaration and assign value in same line
		int[] data = { 12, 14, 43, 45, 745, 23, 23, 43 };
		 // positions: 0  1 2  3  4   5  6   7
		
		System.out.println(data[2]);  // 43
	//	System.out.println(data[9]);  // error ( IndexOutofBoundException )
		
		
		// length of array
		System.out.println(data.length);  // 8
		
		// position of last element
		System.out.println(data.length-1);
		
		System.out.println("---------------");
		
		// printing all data in array

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
		//  no initializing 
		System.out.println(salary[99]); //  0  
		
		
		
		
		
	}

}
