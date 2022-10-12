package com.java.class25;

abstract class Bank {

	public abstract void name();

	public void showBalance(int balance) {
		System.out.println("Balance: " + balance);
	}

}

class HSBCBank extends Bank {

	@Override
	public void name() {
		System.out.println("Welcome to HSBC");

	}

}

class CitiBank extends Bank {

	@Override
	public void name() {

		System.out.println("Welcome to CitiBank");

	}

}

public class BankTester {

	public static void main(String[] args) {

		Bank bank;

		bank = new HSBCBank();
		bank.showBalance(1000);
		bank.name();

		bank = new CitiBank();
		bank.showBalance(2000);
		bank.name();

	}

}
