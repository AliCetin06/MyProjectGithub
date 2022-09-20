package com.java.class06;

import java.util.Scanner;

public class SwitchStatement_ShapeFinder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter of sides: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		
		case 1:
		case 2:
			System.out.println("There is no shape with "+ num +" sides");
			break;
			
		case 3:
			System.out.println("Triangle has a 3 sides");
			break;
		case 4:
			System.out.println("Square has a 4 sides");
			break;
		case 5:
			System.out.println("Pentagon has a 5 sides");
			break;
		case 6:
			System.out.println("Hexagon  has a 6 sides");
			break;
		case 7:
			System.out.println("Heptagon has a 7 sides");
			break;
		case 8:
			System.out.println("Octagon has a 8 sides");
			break;
		case 9:
			System.out.println("Nonagon has a 9 sides");
			break;
		case 10:
			System.out.println("Decagon has a 10 sides");
			break;
			
			default:
				System.out.println("Invalid input");
		}

	}

}
