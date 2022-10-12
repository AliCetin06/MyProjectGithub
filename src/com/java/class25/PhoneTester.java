package com.java.class25;

abstract class Phone {
	public abstract void call(String number);

	public abstract void text(String number, String message);

}

class NormalPhone extends Phone {

	@Override
	public void call(String number) {
		System.out.println(number + " is calling to normalphone");

	}

	@Override
	public void text(String number, String message) {
		System.out.println(number + " is texting about normalphone" + message);
	}

}

class SmartPhone extends Phone {

	@Override
	public void call(String number) {
		System.out.println(number + " is calling to smartphone");

	}

	@Override
	public void text(String number, String message) {
		System.out.println(number + " is texting about SmartPhone" + message);

	}

	public void internetSurfing() {
		System.out.println("Surfing");
	}

}

public class PhoneTester {

	public static void main(String[] args) {
		Phone p;

		p = new SmartPhone();
		p.call("12345");
		p.text("12345", "Hey , how are you?");
		// p.internetSurfing(); error because reference only two method not
		// internetSurfing method
		// if you want to access that method so create an object in SmartPhone class

	}

}
