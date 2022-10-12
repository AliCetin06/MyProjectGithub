package com.java.class26;

class Animal {

	// final method
	public final void feature1() {
		System.out.println("from animal class");
	}
}

class Cat extends Animal {

// you can not implement to final method to other class  it .so it gives error
//	@Override
// 	public void feature1() {
//		System.out.println("from cat class");

}

//final class
final class Phone {
	// nobody nothing inherit from this class  , so it can not be a parent class of any class
}

public class FinalKeyword {

	public static void main(String[] args) {
		// final variable
		final int NUM0FDAYSINWEEK = 7;
		int numOfChocInDay = 5;
		// When a variable is declared with the final keyword,
		// its value can’t be modified, essentially, a constant.

		System.out.println("In a week you are eating " + numOfChocInDay * NUM0FDAYSINWEEK);

	}

}