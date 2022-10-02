package com.java.class21;

public class VehicleTester {

	public static void main(String[] args) {

		Car hondaCity = new Car();
		Vehicle bus = new Vehicle();
		Bike trek = new Bike();
	
		hondaCity.name = " honda city 1.6"; // there is no error to creating to name
		bus.name = "Volvo multiaxle"; // Because they are still different class
		trek.name = "Trek 1.5";

		hondaCity.playMusic("Go on");
		bus.drive();
		bus.stop();
	// bus.playMusic("song"); error because playMusic is not in vehicle class
		hondaCity.drive(); // valid because drive method come from vehicle
		hondaCity.turnAc(); // valid same class object , method relation
		trek.drive(); // valid because drive method come from vehicle
		trek.doubleStand(); // valid same class object , method relation

	}

}
