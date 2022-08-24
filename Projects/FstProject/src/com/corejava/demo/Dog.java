package com.corejava.demo;

public class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("Barks....");
	}

	@Override
	public void eatFood() {
		System.out.println("Carnivorous");
	}
	
}
