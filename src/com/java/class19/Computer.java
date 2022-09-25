package com.java.class19;

public class Computer {

	String processor;
	int ramSize;
	int hddSizememory;
	String color;

	Computer() {
		System.out.println("Constructor with no argument");
	}

	Computer(int ramSize) {
		System.out.println("You called constructor with ram size " + ramSize);
	}
	
	Computer( String processor){
		System.out.println("You called constructor with processor " + processor);
	}

	void start() {

	}

	void shutDown() {

	}

}
