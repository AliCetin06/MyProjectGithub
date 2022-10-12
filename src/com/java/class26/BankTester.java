package com.java.class26;

public class BankTester {

	public static void main(String[] args) {
		
		Bank acc1 = new HSBCBank();
		
		acc1.deposit(1000);
		acc1.displayBalance();
		acc1.withdraw(3000);
		acc1.displayBalance();
		acc1.getLoan();
		
		Bank acc2 = new CitiBank();
		acc2.deposit(5000);
		acc2.displayBalance();
		acc2.withdraw(1000);
		acc2.displayBalance();
		acc2.getLoan();
	}

}
