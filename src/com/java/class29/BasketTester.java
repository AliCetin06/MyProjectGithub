package com.java.class29;

// create a single data type in array list using dynamic data type

//using generatic framework , dynamic data type  , has to be single character
class Basket <T>  {

	//we need a single data type ( like int this example) ,so create a particular data type 
	T data;

	public void setData(T data) {
		this.data = data; // assigning class variable = local variable

	}
	public T getData() {
		return data;
	}
}

public class BasketTester {
	public static void main(String[] args) {
		// use wrapper class to show Integer data type can store in this ArrayList
		Basket <Integer> b = new Basket <Integer> ();
		b.setData(10);
		System.out.println(b.getData());
		
		// use wrapper class to show String data type can store in this ArrayList
		
		Basket <String> b1 = new Basket <String> ();
		b1.setData("Chirag");
		System.out.println(b1.getData());
		
		
	}

}