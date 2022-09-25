package com.java.class19;

public class Bank {

	String accName; // we can share this data with object level , object can control it
	int balance; 	// also called instance variable

	static int accNumber = 0; // we can share this data in class variable so we can update it
								// object can not control this variable
								// also called class variable
	int accountNumber;  // instance variable

	Bank(int balanceFromUser, String accNameFromUser) // local variables , creative and destroyed in constructor
	{
		balance = balanceFromUser;
		accName = accNameFromUser;
		accNumber = accNumber +1;
		accountNumber = accNumber;

	}

	Bank(int balance) {
		this.balance = balance; // this point to bank`s class balance variable
	} // you have to use this method to point it or you can use different name
		// balance = balanceFromUser

	public void deposite(int amount) {
		System.out.println(accName + " has deposited " + amount);
		balance = balance + amount;
	}

	public void withdraw(int amount) {
		System.out.println(accName + " has withdrawed " + amount);
		balance = balance - amount;
	}

	public void displayBalance() {
		System.out.println(balance);
	}
	
	public void  displayAccountNumber () {
		System.out.println(accountNumber );
	}

}
