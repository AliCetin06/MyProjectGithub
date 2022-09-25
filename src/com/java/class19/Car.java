package com.java.class19;

public class Car {

	int numOfGears;
	String color;

	// constructor makes initialize values as a default value
	Car() {
		numOfGears = 4;
		color = "white";
	}

	void drive() {
		System.out.println(numOfGears);
		System.out.println(color);

	}

	void breakOfCar() {

	}

	public static void main(String[] args) {

		Car c = new Car(); // calling to constructor
		c.drive();

	}

}
