package com.coreproject.demos.oops;

public interface Inf1 {
	int i=10;
	void get();
	private void set() {
		System.out.println("set of Inf1");
	}
	default void put()
	{
		set();
		System.out.println("put of Interface Inf1");
	}
}
