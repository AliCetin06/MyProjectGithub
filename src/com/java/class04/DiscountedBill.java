package com.java.class04;

public class DiscountedBill {

	public static void main(String[] args) {
		int billAmount = 90000;
		double finalBill;
		double discount;
		if (billAmount >= 10000) {
			discount = billAmount * 0.15;
			finalBill = billAmount - discount;
			System.out.println("Discont: " + discount);
			System.out.println("Final bill: " + finalBill);

		} else if (billAmount >= 80000) {
			discount = billAmount * 0.10;
			finalBill = billAmount - discount;
			System.out.println("Discont: " + discount);
			System.out.println("Final bill: " + finalBill);

		} else if (billAmount >= 50000) {
			discount = billAmount * 0.5;
			finalBill = billAmount - discount;
			System.out.println("Discont: " + discount);
			System.out.println("Final bill: " + finalBill);

		} else if (billAmount >= 0) {
			discount = billAmount;
			finalBill = billAmount - discount;
			System.out.println("Discont: " + discount);
			System.out.println("Final bill: " + finalBill);

		} else {
			System.out.println("billAmount can not be negative");
		}

	}
}
