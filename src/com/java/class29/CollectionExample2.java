package com.java.class29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Create an arraylist of 10 numbers using scanner class and sort ArrayList , create a copy ArrayList , sort ArrayList in dec order and compare both array
public class CollectionExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 10 numbers: ");
		List<Integer> data= new ArrayList<Integer>();

		
		for(int i=0 ; i < 10 ;i++ ) {
		    data.add(sc.nextInt());
		   
		}
		
		System.out.println("You entered "+ data);
		 //sorting  ArrayList by using Collection class
		Collections.sort(data);
		
		// copy of data
		List<Integer> copyOfData = new ArrayList<Integer>(data);
		
		// reversing copy of data and sorting
		Collections.sort(copyOfData ,Collections.reverseOrder() );
		System.out.println(copyOfData);
		
		// compare to two ArrayList
		System.out.println(data.equals(copyOfData));  // checking contain as well as order

	}

}
