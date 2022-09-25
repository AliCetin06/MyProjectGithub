package com.java.class20;

public class SmartPhone {
	
	double display;
	int ram;
	int rom ;
	int camera;
	String processor;
	String operatingSystem;
	

	SmartPhone(){
		display = 6.6;
		ram= 8;
		rom = 512;
		processor ="Snapdragon 865";
		camera = 108;
		operatingSystem = "Android";
	
	}
	
	void displayFeatureOfPhone() {
		System.out.println("Display: "+ display + " inches");
		System.out.println("RAM: "+ ram + " GB");
		System.out.println("ROM: "+ rom + " GB");
		System.out.println("processor: "+ processor);
		System.out.println("camera: "+ camera + " MP");
		System.out.println("operatingSystem: "+ operatingSystem );
	}
	
	public static void main(String[] args) {
		SmartPhone iphone = new SmartPhone();
		iphone.displayFeatureOfPhone();
	}

	
}