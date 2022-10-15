package com.java.class28;

public class FinallyBlock {

//The finally block in java is used to put important codes such as clean up code e.g. closing the file or 
//closing the connection. The finally block executes whether exception rise or not and whether exception handled or
//not. A finally contains all the crucial statements regardless of the exception occurs or not.

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		
		try {
			System.out.println("Start of try block");
			System.out.println(arr[11]);
		}catch(Exception e) {
			System.out.println("Start of catch block");
			e.printStackTrace();
			System.out.println("End of catch block");
		}finally {
			System.out.println("It will executed for sure");
		}

	}

}
