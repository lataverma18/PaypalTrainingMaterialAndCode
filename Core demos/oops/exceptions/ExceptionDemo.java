package com.coreproject.demos.oops.exceptions;

import java.io.IOException;

public class ExceptionDemo {

	static void get() //throws IOException
	{
		int c=10/2;
		System.out.println(c);
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		
		try
		{
			System.exit(0);
			get();
		
		}
		/*
		 * catch(Exception re) { System.out.println("Runtime Exception"); }
		 */
		finally
		{
			System.out.println("Mandatory Code");
			int c=10/0;
			System.out.println("End of Finally");
		}
		
		System.out.println("End of the Program!!!");
	}
}
