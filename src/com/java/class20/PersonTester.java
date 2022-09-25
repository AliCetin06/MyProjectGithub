package com.java.class20;

class Person {

	static String name;
	int age;

}

public class PersonTester {

	public static void main(String[] args) {
		Person p = new Person();
		p.age = 26;

		Person.name = "Ali";

		System.out.println("Name of person: " + Person.name);
		System.out.println("Age of person: " + p.age);

	}

}
