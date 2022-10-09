package com.java.class23;

class Bank {
	// You can not access datas and modify it ,
	// but you can use the method

	private int balance;
	private String accNumber;
	private String accName;
	private int age;
	private String phoneNumber;
	
	protected int dob;

	// getter and setter allow us to read or update the hidden datas

	// read the data ( Getter)
	public int getAge() {
		return age;
	}

	// update the data ( Setter )
	public void setAge(int ageFromUser) {
		age = ageFromUser;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if ( balance < 1000) {
		this.balance = balance;
		System.out.println("Account "+ accName + " updated balance $"+ balance);
		
		}else {
			System.out.println("you can update till 10000 only per day");
		}
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void getLoan() {
		System.out.println("Getting loan from bank");
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public void displayBalance() {
		System.out.println(balance);
	}

}

class HSBCBank extends Bank {
	@Override
	public void getLoan() {
		System.out.println("Getting loan from HSBCBank bank");
	}
}

public class Encapsulation {
	public static void main(String[] args) {

		// reference of bank class
		Bank b1, b2;
		// creating a object from bank class
		b1 = new Bank();
		b1.getLoan();
		// Getting loan from bank

		// creating a object from HSBCBank class
		b2 = new HSBCBank();
		b2.getLoan();
		// Getting loan from HSBCBank bank

		b1.deposit(1000);
		b1.setBalance(30000); //you can update till 10000 only per day
		b1.setAccName("Chirag");
		b1.setBalance(300);  // Account Chirag updated balance $300
		
		b1.displayBalance(); // 1000

		b1.setAge(40); // update the data
		System.out.println(b1.getAge()); // read the data

	}
}
