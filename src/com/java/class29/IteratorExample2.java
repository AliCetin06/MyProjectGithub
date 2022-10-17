package com.java.class29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample2 {

	public static void main(String[] args) {

		List<String> country = new ArrayList<String>();

		country.add("Turkey");
		country.add("Englend");
		country.add("Portucal");
		country.add("Spain");
		country.add("Usa");

		String c = "Turkey";

		// Iterator has to be here after add some datas , otherwise it gives error

		Iterator<String> itr = country.iterator();

		while (itr.hasNext()) {
			if (c == itr.next()) {
				System.out.println(c + " is inside of ArrayList");
				break;
			} else {
				System.out.println(c + " is NOT inside of ArrayList");
				break;
			}
		}

		// 2. way to check
		System.out.println(country.contains("Spain")); // true
		System.out.println(country.contains("France")); // false
		System.out.println(country.isEmpty()); // false

	}

}
