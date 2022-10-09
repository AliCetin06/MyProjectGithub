package com.java.class22;

class Shape {

	void draw() {
		System.out.println("From parent");
	}

	void erase() {
		System.out.println("From parent");
	}

	void paint() {
		System.out.println("From parent");
	}
}

class Square extends Shape{
	
	@Override
	void draw() {
		
		System.out.println("Square is drawing");
	}
	
}
class Circle extends Shape{
	
	@Override
	void paint() {
		System.out.println("Circle is painting");
	}
}

public class ShapeTester {

	public static void main(String[] args) {
		
		Square sq = new Square();
		sq.draw(); //Square is drawing
		
		Circle c = new Circle();
		c.paint(); //Circle is painting
		
		// run time (dynamic)  polymorpshsism
		
		Shape sh = new Square();
		sh.paint(); // From parent
		sh.draw();  // Square is drawing

	}

}
