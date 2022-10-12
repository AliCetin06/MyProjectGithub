package com.java.class26;

// Interface

public interface Bank {

	// All method has to be abstract
	// By default , all methods are abstract so you may not use abstract keyword

	double BANK_PROTOCOL = 1.23; // By default variable in Interface , final and static use it.

	public abstract void withdraw(int amount);

	public void deposit(int amount);

	public void getLoan();

	public void displayBalance();

}

// We use implements keyword for interface

class HSBCBank implements Bank {

	int balance;

	@Override
	public void withdraw(int amount) {
		balance = balance - amount;

	}

	@Override
	public void deposit(int amount) {
		balance = balance + amount;
	}

	@Override
	public void getLoan() {
		System.out.println("Get loan from HSBC");
	}

	@Override
	public void displayBalance() {
		System.out.println(balance);

	}
	
}
	class CitiBank implements Bank{
		int balance;

		@Override
		public void withdraw(int amount) {
			balance = balance - amount;			
		}

		@Override
		public void deposit(int amount) {
			balance = balance + amount;
			
		}

		@Override
		public void getLoan() {
			System.out.println("Get loan from CitiBank");			
		}

		@Override
		public void displayBalance() {
			System.out.println(balance);
			
		}
		
	}

