package com.coreproject.demos.oops.lambdas;

class A
{
	void get()
	{
		System.out.println("get of A");
	}
	static void set()
	{
		System.out.println("set of A");
	}
	A()
	{
		System.out.println("A constructor");
	}
}
interface B 
{
	void put();
}
public class MethodReferenceDemo {
	public static void main(String[] args) {
		//A a1=new A();
		
		//B b1=a1::get;
		//B b1=A::set;
		B b1=A::new;
		b1.put();
	}
}
