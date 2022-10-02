package com.java.class21;

public class PageTester {

	public static void main(String[] args) {
		
		Page mainPage = new Page();
	
		
		LoginPage login = new LoginPage();
		login.doLogin("Chirag", "test@123");
		login.validateLogoIsDisplayed();
		login.validatePageHeader();
		login.validatePageTitle();

		HomePage home = new HomePage();
		home.serachProduct("Tv");
		home.validateLogoIsDisplayed();
	}

}
