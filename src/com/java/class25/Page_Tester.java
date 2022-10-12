package com.java.class25;

abstract class Page {

	int balance;

	// abstract class constructor
	Page() { // allow us to instance methods ready to use

		balance = 1000;

	}
	public static void feature1() {
		System.out.println("static method");
	}

	public abstract void openPage();
	// abstract method = dose not give any information how we implement
	// but it show what we will implement

	public void closePage() {
		System.out.println("closing page");
	}

}

class LoginPage extends Page {  // has to extend abstract class
	
	@Override  // has to override abstract method
	public void openPage() {
		System.out.println("Opening Login Page");
	}

	public void closePage() {
		System.out.println("Closing Login Page");
	}

}

class HomePage extends Page{

	@Override
	public void openPage() {
		
	}
	
}

public class Page_Tester {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.openPage();

	}

}
