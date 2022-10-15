package com.java.class27;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			e.printStackTrace(); // full message of exception
		}

		int c = 5;
		int d = 0;
		try {
			System.out.println(c / d);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());  // just description of exception
		}
		
		 int f=5;
	      int g=0;
	        try{
	          System.out.println(f/g);
	        }
	      catch(ArithmeticException e){
	        System.out.println(e.getMessage());  // only the reason of the exception
	      }

	}

}
