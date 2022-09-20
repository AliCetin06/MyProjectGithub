package com.java.class08;

public class TypeCastingReview {

	public static void main(String[] args) {
		//Type casting is when you assign a value of one primitive data type 
		// to another type.
		
		// widening casting
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	    
	    System.out.println("----------------");
	    
	    
	    // Narrowing casting
	    double myDouble2 = 9.78;
	    int myInt2 = (int) myDouble; // Manual casting: double to int

	    System.out.println(myDouble2);   // Outputs 9.78
	    System.out.println(myInt2);      // Outputs 9

	}

}
