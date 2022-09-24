package com.java.class18;

public class BankTester {

	public static void main(String[] args) {
		Bank hsbc = new Bank();

		hsbc.fullName = "Ali Cetin";
		hsbc.accountNumber = 124243345;

		System.out.println(hsbc.fullName);
		System.out.println(hsbc.accountNumber);
		hsbc.deposite(1000); // Accessing private info with using method
		hsbc.showBalance();   // 1000+ 123 = 1123
	}

}
