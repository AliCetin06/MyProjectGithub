package com.java.class09;

public class FindingEachDigitOfNumber {

	public static void main(String[] args) {
		
		int num = 123456;
		int lastDigit;
		
		while (num != 0 ) {
			lastDigit = num % 10;
			System.out.println(lastDigit);   // printing last digit
			  num = num /10 ;  // removing last digit
			}
			
		}

	}


