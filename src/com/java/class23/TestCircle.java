package com.java.class23;

class Circle {
	private double radius;
	private String color;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}



	Circle() {
		radius = 1.0;
		color = "red";

	}

	Circle(double radiusFromUser) {
		radius = radiusFromUser;
	}

	public double getRadius(double radius) {
		return radius;
	}

	public double getArea() {

		return  (Math.PI * radius * radius);
		
	}

}


public class TestCircle {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		System.out.println("The circle has radius of "+ c.getRadius()+ " and area of "+ c.getArea());
		
		Circle d = new Circle(2.5);
		System.out.println("The circle has radius of "+ d.getRadius()+ " and area of "+ d.getArea());
	}

}
