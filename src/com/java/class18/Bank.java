package com.java.class18;

public class Bank {

	private int balance = 123;
	public String fullName;
	String accName;
	int accountNumber;

	public void deposite(int amount) {
		balance = balance + amount;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public void showBalance() {
		System.out.println(balance);
	}

}
