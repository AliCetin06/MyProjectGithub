package com.java.class21;

public class CalculatorTester {

	public static void main(String[] args) {

		BasicCalculator bc = new BasicCalculator();
		bc.sum(10, 20);

		// using to parent class(basic calculator) feature
		AdvanceCalculator ac = new AdvanceCalculator();
		ac.sum(10, 20);

	}

}