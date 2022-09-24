package com.java.class18;

public class Person {

	String name;
	double height;
	int age;
	char gender;

	void eat() {
		System.out.println(name + " is eating");

	}

	void sleep() {
		System.out.println(name + " is sleeping");
	}

	void displayPersonInfo() {
		
		System.out.println(name);
		System.out.println(height);
		System.out.println(age);
		System.out.println(gender);
	}

}