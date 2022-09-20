package com.java.class05;

public class LoginFuncionalityNestedIfElse {

	public static void main(String[] args) {
		String dbUsername = "chirag4";
		String dbPassword = "test@123";

		String username = "chirag";
		String password = "test@123";

		if (dbUsername == username) {
			if (dbPassword == password)
				System.out.println("login succesful");
			else {
				System.out.println("Invalid  password");
			}
		} else {
			if (dbPassword != password) {
				System.out.println("Wrong username and password");

			} else {
				System.out.println("just Wrong username");
			}
		}
	}
}