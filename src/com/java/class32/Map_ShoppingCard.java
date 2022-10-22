package com.java.class32;

import java.util.HashMap;
import java.util.Map;

public class Map_ShoppingCard {
	
	// print all the items with price above 40.0 cents

	public static void main(String[] args) {
		
		Map<String , Double> shop = new HashMap<String, Double>();
		shop.put("Tomatoes price: ", 40.50);
		shop.put("Onion price: ", 30.50);
		shop.put("Canola oil price: ", 99.99);
		shop.put("Potatoes price: ", 50.00);
		shop.put("Apple price: ", 99.99);
		shop.put("Jack Fruit price: ", 80.99);
		shop.put("Butter price: ", 10.99);
		
		// forEach loop and lambda expression 
		// lambda expression is unnamed or anonymous method
		
		shop.forEach((key , value) -> {
			if( value > 40.00) {
				System.out.println(key + value);
			}
			
		});
		
	/*  Example lambda expression
	 * 
	 * double getSomeDecimal(double a)						
	 * {								same as(shortened)		(a) -> 2.00
	 * 	return 2.00;
	 * 		}
	 * 
	 * 
	 */
		

		
	}	
	}
