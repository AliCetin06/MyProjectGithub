package com.java.class26;

public class Exception {

	public static void main(String[] args) {
		
		int num1 = 10 ,num2 =0;
		int data [] = {1,2,3,4,5,6};
		
		// Whenever we feel a run time error , we need to back-up plan
		//error means you can not control it however we can control the exceptions
		
		
		System.out.println(num1 /num2);  //Arithmetic exception
		System.out.println(data[7]);	 //ArrayIndexOutBounds Exception
		
	}

}
