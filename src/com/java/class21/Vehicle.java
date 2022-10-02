package com.java.class21;

public class Vehicle {
	
	String name;
	int age ;
	String color;
	int maxSpeed;
	
	public Vehicle(){
		System.out.println("Constructor from Vehicle");
	}
	
	
	public void drive()
	{	
		System.out.println("driving " + name);
	}
	 public void stop() {
		System.out.println(name +" is stoping");
	}

}

class Car extends Vehicle {
	
	public Car() {
		System.out.println("Constructor from Car");

	}
	
	
	public void playMusic(String music) {
		System.out.println("playing song  "+ music+ " in " + name);
	}
	public void turnAc() {
		System.out.println("turning to AC");
	}
	
}

class Bike extends Vehicle {
	
	public void kickStart() {
		System.out.println("kick starting "+ name);
		
	}
	public void doubleStand() {
		System.out.println("Double standing "+ name);
	}
	
}

	



