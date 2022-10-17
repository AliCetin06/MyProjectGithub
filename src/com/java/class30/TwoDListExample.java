package com.java.class30;

import java.util.ArrayList;
import java.util.List;

public class TwoDListExample {

	// list of list (2D)

	public static void main(String[] args) {

		List<String> usernameList = new ArrayList<String>();
		List<String> passwordList = new ArrayList<String>();

		// we store list which is include type of <List<String>> ,, creating two
		// dimentional list
		List<List<String>> credentialList = new ArrayList<List<String>>();

		// 1. rows
		usernameList.add("admin");
		usernameList.add("admin");
		usernameList.add("demo");
		usernameList.add("test");

		// 2. rows
		passwordList.add("admin");
		passwordList.add("admin123");
		passwordList.add("demo123");
		passwordList.add("test@123");

		// combine two list

		credentialList.add(usernameList);
		credentialList.add(passwordList);

		for (List<String> list : credentialList) {
			for (String data : list) {
				System.out.print(data + "   ");
			}
			System.out.println();
		}

		// 1. rows gives username
		// 2. rows gives password

	}

}
