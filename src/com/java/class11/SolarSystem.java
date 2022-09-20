package com.java.class11;

public class SolarSystem {

	public static void main(String[] args) {

		String[] planet = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
		System.out.println("Length of the planets: " + planet.length);
		for (int i = 0; i < planet.length; i++) {
			if (planet[i] == "Earth") {
				System.out.println("Earth is at " + i + " index");
			}

		}

	}
}
