package com.corejava.demo;

public class SystemDemo {
	public static void main(String[] args) {
		System.out.println();
		System.err.println("Hello World!!!");
		long stTime=System.nanoTime();
		//Logic
		long endTime=System.nanoTime();
		System.out.println(endTime-stTime);
		
	}
}
