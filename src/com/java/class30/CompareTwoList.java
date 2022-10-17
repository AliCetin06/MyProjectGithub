package com.java.class30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTwoList {

	public static void main(String[] args) {
		
		List<Integer> data = new ArrayList<Integer>();
		List<Integer> copyOfData = new ArrayList<Integer>();
		
		data.add(98);
		data.add(34);
		data.add(45);
		data.add(12);
		
		System.out.println(data);
	
		//  we can not copy of object , we actually point same address location (data address)
		copyOfData = data;
		
		
		Collections.reverse(copyOfData);
		
		System.out.println(data);
		System.out.println(copyOfData);
		
		System.out.println(copyOfData.equals(data));  // true
		
		
		
		
		
		

	}

}
