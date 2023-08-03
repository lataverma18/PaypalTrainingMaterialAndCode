package com.coreproject.demos.oops;

public class Inf1Impl implements Inf1,Inf2{

	@Override
	public void get() {
		System.out.println("get of Inf1Impl");
	}

	@Override
	public void put() {
		// TODO Auto-generated method stub
		Inf1.super.put();
	}
}
