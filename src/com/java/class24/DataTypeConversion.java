package com.java.class24;

public class DataTypeConversion {

	public static void main(String[] args) {
		
		String i = "10" , j =" 20";  // It has to be no space or nonnumber gives error
		Double d = 5.45;
		
		// string to int 
		int a  = Integer.parseInt(i);
		int b  = Integer.parseInt(j.trim()); //remove to space all spaces
		System.out.println(a + b);  //30
		
		// int to String
		
		String k = String.valueOf(a) ;
		String l = String.valueOf(b) ;
		System.out.println(k+ l);  //1020
		
		// double to String
		
		String sd = String.valueOf(d);
		System.out.println(sd);
		
		
		
		
	}

}
