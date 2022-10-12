package com.java.class26;

//1 Interface can be extends other interfaces ;however can not be implement

interface A extends B, C {
	public void featureA1();

}

interface B {
	public void featureB1();

}

interface C {
	public void featureC1();

}

abstract class X extends Y {
	public abstract void featureX1();

	public void featureX2() {
		System.out.println("from non-abstract method x");
	}
}

abstract class Y {
	public void featureY1() {
		System.out.println("From class Y");
	}

	public void featureY2() {
		System.out.println("from non-abstract method y");
	}
}

// implement from A , B (interface ) , extends from X(abstract)
class Demo extends X implements A, B {

	@Override
	public void featureX1() {
		System.out.println("from class demo featurex1");

	}

	@Override
	public void featureB1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void featureA1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void featureC1() {
		// TODO Auto-generated method stub
		
	}

}

public class DemoTester {
	public static void main(String[] args) {

		Demo d = new Demo();
		d.featureX1();
		d.featureX2();

	}
}
