package com.java.class31;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfWord {

	public static void main(String[] args) {

		String str = "This is may first java program and today is my last class for java program."
				+ "I enjoyed it but also I need to practice more in java program";

		str = str.replace(".", " "); // replace space instead of .
		String[] words = str.split(" ");

		Map<String, Integer> frequency = new HashMap<String, Integer>();

		// creating a frequency of one word

		for (String i : words) {
			if (frequency.containsKey(i)) {
				frequency.put(i, frequency.get(i) + 1);
			} else {
				frequency.put(i, 1);
			}
		}

		// traveling all world and finding all frequency

		Set<String> allKey = frequency.keySet();

		for (String key : allKey) {
			System.out.println(key + " = " + frequency.get(key));
		}

	}

}
