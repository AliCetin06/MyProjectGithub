package com.java.class02;

public class StringAndStringConc {

	public static void main(String[] args) {
		
		String str1 = "Hello word";
		System.out.println(str1);
		
		String str2 = "How are you";
		System.out.println(str2);
		System.out.println();
		String str3 = " ";
		
		System.out.println(str1+ str3 + str2+"\n");
		
		
		int a = 10 ,b=5;
		System.out.println(str1 + a );  // string + int
		System.out.println(str1 + a + b);  // string + int + int
		System.out.println(str1 + (a+b));
		System.out.println(a + b + str1);
		System.out.println(str1 + a * b);
	
//		System.out.println(str1 + a -b);  exception unresolved compilation problem
		
		System.out.println(a - b + str1);  // no problem
			
		
	}

}
