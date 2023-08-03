package com.coreproject.demos.oops.exceptions;

public class CustomExceptionDemo {

	public static void main(String[] args) {
	int age=-10;
	try
	{
	if(age<0)
		throw new NegativeAgeException("Age value is Negative");
	}
	catch(NegativeAgeException ne)
	{
		System.out.println(ne);
	}
	System.out.println("End of Program!!!");
	}
}
