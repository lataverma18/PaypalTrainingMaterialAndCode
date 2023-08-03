package com.coreproject.demos.oops;

public class SystemDemo {
public static void main(String []args)
{
	System.out.println("Hello World");
	System.err.println("Hello World!!!");
	long stTime=System.currentTimeMillis();
	//Logic
	long endTime=System.currentTimeMillis();
	System.out.println(endTime-stTime);
}
}
