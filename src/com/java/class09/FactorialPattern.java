package com.java.class09;

import java.util.Scanner;

public class FactorialPattern {

	public static void main(String[] args) {

		// 1 * 2 * 3 * 4 * 5
		
		System.out.print("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int mult =1;
		for (int i = 1; i <= num; i++) {
		
				mult = mult * i;
			}
		System.out.println("factoriel of "+num+ "---->"+ mult);

		}

	}

