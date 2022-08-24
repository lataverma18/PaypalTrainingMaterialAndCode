package com.corejava.demo;

class A
{
	int i=10;
	A(int i)
	{
		System.out.println("A Class Constructor!!!");
	}
	void xyz()
	{
		System.out.println("A Class xyz");
	}
}
class B extends A
{
	int i=20;
	B()
	{
		super(12);
		System.out.println("B Class Constructor!!!");
	}
	B(int i)
	{
		super(30);
	}
	@Override
	void xyz()
	{
		System.out.println("B Class xyz");
	}
	void get() {}
}
class C extends B
{
	@Override
	void xyz()
	{
		System.out.println("C Class xyz");
	}
}
class D extends C
{
	void another()
	{
		xyz();
		super.xyz();
	}
}

public class Demo1 {
	public static void main(String []args)
	{
		B b1=new B();
		B b2=new B(20);
		
		A a1=new B();
		a1.xyz();
		System.out.println(a1.i);
		
		B b=(B)a1;		//Possible
	}
}
