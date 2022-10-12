package com.java.class26;

public class PageTester {

	public static void main(String[] args) {
		Page p =new LoginPage();
		p.openPage();
		p.closePage();
		
		p = new HomePage();
		p.openPage();
		p.closePage();
	}

}
