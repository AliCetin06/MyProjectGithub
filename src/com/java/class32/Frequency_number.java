package com.java.class32;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Frequency_number {

	public static void main(String[] args) {

		Random r = new Random();

		List<Integer> numbers = new ArrayList<Integer>();

		for (int i = 1; i < 11; i++) {
			numbers.add(r.nextInt(i));

		}
		System.out.println(numbers);

		Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();

		// creating a frequency of one number

		for (Integer i : numbers) {
			if (frequency.containsKey(i)) {
				frequency.put(i, frequency.get(i) + 1);
			} else {
				frequency.put(i, 1);
			}
		}

		// traveling all integer and finding all frequency

		Set<Integer> allKey = frequency.keySet();

		for (Integer key : allKey) {
			System.out.println(key + "`s amounth---->" + frequency.get(key));
		}

	}

}
