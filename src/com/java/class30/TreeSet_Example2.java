package com.java.class30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Example2 {

	public static void main(String[] args) {
		
		Set<Integer> numbers = new TreeSet<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<5 ;i++) {
			System.out.println("Enter a number: ");
			numbers.add(sc.nextInt());
			
			
		}
		// converting Set to List
		List<Integer> numList = new ArrayList<Integer>(numbers); 
		
		System.out.println("Max value of Set: "+ numList.get(numList.size()-1));  // get max value
		System.out.println("Min value of Set: "+ numList.get(0));  				 // get min value
		
		// or you can use first create a ArrayList then use Collections class max() and min() method
		
		
		

	}

}
