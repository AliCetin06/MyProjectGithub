package com.java.class27;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		int i = 10, j = 2;
		Scanner sc =null;  // it means sc does not exsict inside memory

		// critical statements , so it needs a backup plan
		try {
			System.out.println(arr[1]); // if there is an exception firstly, it will not go back to check try block
										// going to catch block then going to outside try block
			System.out.println(i / j);
			sc.nextInt();
			
			// general name exception
		} catch (Exception e) {
			System.out.println(e.toString());  // showing which exception we handled it

		}
		
	}

}


