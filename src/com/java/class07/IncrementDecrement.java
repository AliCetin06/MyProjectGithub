package com.java.class07;

public class IncrementDecrement {

	public static void main(String[] args) {
		int a = 10, j;
		j = a++; 	// j will be 10 however a will be 11
					// because there is a post increment
					// Usually use in while loop

		System.out.println(j);
		System.out.println(a);

		System.out.println("-----------------");

		int k = 10, m = 10, n;
		n = k + m++; // post increment

		System.out.println(n); // 20
		System.out.println(m); // 11

		System.out.println("-----------------");

		int x = 10, y;
		y = ++x;    // pre increment , do first increment then assign value

		System.out.println(x);  //11
		System.out.println(y);  //11

	}

}
