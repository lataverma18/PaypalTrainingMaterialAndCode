package com.corejava.demo;

public interface Button {
	int thikness=10;
	void on();
	void off();
	
	static void get() 
	{
		System.out.println("get of Button");
	}
}
