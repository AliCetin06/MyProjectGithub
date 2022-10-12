package com.java.class25;

abstract class Shape1 {

	public abstract void draw(); // need to override

	public void erase() {
		System.out.println("Erasing");
	}

}

class Circle1 extends Shape1 {

	@Override
	public void draw() {
		System.out.println("Drawing circle");

	}

}

class Square1 extends Shape1 {
	@Override
	public void draw() {
		System.out.println("Drawing square");

	}

}

public class ShapeTester {
	public static void main(String[] args) {
		
		// This is called UPCASTING

		Shape1 s;   //  creating one object 
		
		s= new Circle1();
		s.draw();  //Drawing circle
		s.erase(); //Erasing
		
		s = new Square1();
		s.draw();  //Drawing square
		s.erase(); //Erasing
		
  
	}
}