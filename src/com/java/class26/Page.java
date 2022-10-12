package com.java.class26;

public interface Page {
	
	void openPage();
	void closePage();

}

class LoginPage implements Page{

	@Override
	public void openPage() {
		System.out.println("opening to LoginPage");
		
	}

	@Override
	public void closePage() {
		System.out.println("closing to LoginPage");		
	}
	
}

class HomePage extends LoginPage{
	@Override
	public void openPage() {
		System.out.println("opening to HomePage");
		
	}

	@Override
	public void closePage() {
		System.out.println("closing to HomePage");		
	}
}
