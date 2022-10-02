package com.java.class21;

// parent class 

public class Page {

	public void validateLogoIsDisplayed() {
		System.out.println("validating logo");
	}

	public void validatePageTitle() {
		System.out.println("validating title");
	}

	public void validatePageHeader() {
		System.out.println("validating header");
	}

}

// child classes
class LoginPage extends Page {
	
	public void doLogin(String username , String password) {
		System.out.println("logging in with username and password");
	}
	
	public void forgetPassword (String username) {
		System.out.println("Clicking on forget password for user "+ username);
	}
	

}

class HomePage extends Page {
	public void serachProduct(String productName) {
		System.out.println("Searching "+productName);
	}
	

}

