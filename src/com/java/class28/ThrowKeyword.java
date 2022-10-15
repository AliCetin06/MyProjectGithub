package com.java.class28;

//The throw keyword in Java is used to explicitly throw an exception from a method or any block of code.

//Java program that demonstrates the use of throw keyword
class ThrowKeyword
{
	static void fun()
	{
		try
		{
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught inside fun().");
			throw e; // rethrowing the exception
		}
	}

	public static void main(String args[])
	{
		try
		{
			fun();
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught in main.");
		}
	}
}
