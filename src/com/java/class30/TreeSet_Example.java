package com.java.class30;


import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Example {
	
	
	// allow us automatically sorting value from small to big number
	public static void main(String[] args) {
		Set<Integer> data = new TreeSet<Integer>();
		
		data.add(98);
		data.add(34);
		data.add(45);
		data.add(12);
		data.add(47);
		
		for(Integer i : data){
			System.out.println(i);
		}


	}

}
