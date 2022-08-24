package com.corejava.demo.collections;

public class GenericDemo {

	public static void main(String[] args) {
		A<Integer> a1=new A<>(); //--> i -> Integer
		a1.set(10);
		//a1.set("Hello");	//Error
	A<String> a2=new A<>(); // --> i -> String
		a2.set("Hi"); 
		//a2.set(20);		//Error
	A<Boolean> a3=new A<>();   //--> i -> Boolean
		a3.set(true);
		//a3.set(10);		//Error
		
		A a4=new A();
		a4.set(10);
		a4.set("Hello");

	}

}
