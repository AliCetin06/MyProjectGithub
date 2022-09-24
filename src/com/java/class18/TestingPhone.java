package com.java.class18;

public class TestingPhone {

	//  iphone.color ="blue";
	// we can not assignment inside on class ;however,
	
	// Phone iphone = new Phone();
	// we can initialize inside on class or method
	
	
	public static void main(String[] args) {
		
		Phone iphone = new Phone();
		Phone samsung = new Phone();
		
		iphone.color ="blue";
		iphone.model = "14";
		iphone.sizeOfRam = 4;
		iphone.memory= 256;
		
		samsung.color ="green";
		samsung.model = "34";
		samsung.sizeOfRam = 8;
		samsung.memory= 128;
		
		
		System.out.println(iphone.color);
		iphone.call("34456456");
		iphone.text("34456456", "Hello world");
		
		System.out.println(samsung.color);
		samsung.call("34456456");
		
		
		
		
		

	}

}
