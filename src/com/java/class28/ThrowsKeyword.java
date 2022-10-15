package com.java.class28;

public class ThrowsKeyword {
	//The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. 
	//We can throw either checked or unchecked exception. The throw keyword is mainly used to throw 
	//custom exceptions
	
	// use throws the if you don`t know the backup plan

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("First line");
		
			// critical statement
			Thread.sleep(3000);  // 3 second = 3000 ms
			
			printLine();
		 
			
		
		System.out.println("Second line");

		 }
	
	public static void printLine() throws InterruptedException {
		
		Thread.sleep(3000);
	}
}
