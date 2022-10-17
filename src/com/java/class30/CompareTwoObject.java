package com.java.class30;


class Demo {
	int a;
}
public class CompareTwoObject {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		d1.a =10;
		
		// we can not copy of object , we actually point d2 point to d1 value
		d2=d1;
		
		System.out.println(d2.a);  // 10
		
		d2.a =100;
		System.out.println(d1.a);  // 100 
	}

}
