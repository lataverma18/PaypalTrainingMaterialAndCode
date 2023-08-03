package com.coreproject.demos.oops.multithreading;

public class Printer {
	 void printing(){
		System.out.println("Printer Starts Printing for Machine "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Printer Ends Printing for Machine "+Thread.currentThread().getName());
	}

}
