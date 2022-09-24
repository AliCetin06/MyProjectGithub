package com.java.class18;

public class TestingPerson {

	public static void main(String[] args) {

		Person chirag; // create a object in Person class

		chirag = new Person(); // Initializing object

		Person ali = new Person();

		ali.name = "Ali Cetin";
		ali.age = 26;
		ali.gender = 'm';
		ali.height = 6.0;

		System.out.println(ali.age); 	 // 26
		System.out.println(chirag.age);  // 0
		
		ali.eat();
		chirag.eat();
		
		ali.displayPersonInfo();
		chirag.displayPersonInfo();

	}

}
