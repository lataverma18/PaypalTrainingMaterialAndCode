package com.corejava.demo;

public class OprnDemo {

	public static void main(String[] args) {
		MyTemp1 mm=new MyTemp1();
		if(mm instanceof MyMarkerInterface)
			System.out.println("Certain Operation");
		else
			System.out.println("Not Allowed");

	}
}
