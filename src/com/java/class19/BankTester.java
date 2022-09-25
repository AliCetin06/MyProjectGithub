package com.java.class19;

public class BankTester {

	public static void main(String[] args) {
		 

		Bank acc1 = new Bank(1000, "Chirag");
		Bank acc2 = new Bank(5000, "John");
		Bank acc3 = new Bank(1000, "Chirag");
		Bank acc4 = new Bank(5000, "John");
		
		acc1.displayAccountNumber();	//1
		acc2.displayAccountNumber();	//2
		acc3.displayAccountNumber();	//3
		acc4.displayAccountNumber();	//4
		

		acc2.deposite(1000); // John has deposited 1000
		acc2.displayBalance(); // 1000+ 5000 =6000

		acc1.withdraw(2000);
		acc1.displayBalance(); // 1000 -2000 = -1000

//		Bank acc5 = new Bank(14.0 , "Chirag");   error
//		Bank acc6 = new Bank("Mehmet" , 123);	 error
//		Bank acc7 = new Bank();        			 error 
//		Bank acc8 = new Bank(123 , "");			 works
//		Bank acc9 = new Bank(0 , null);		  	 works
//		Bank acc10 = new Bank(null , null);		 error 
//		Bank acc11 = new Bank(0 , 0);		     error 

		Bank acc12 = new Bank((int) 15.0);
		acc12.displayBalance();

	}

}