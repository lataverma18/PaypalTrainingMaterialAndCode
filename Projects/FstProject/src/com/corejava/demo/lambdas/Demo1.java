package com.corejava.demo.lambdas;

class Temp
{
	static void put(int i)
	{
		System.out.println(++i);
	}
}
@FunctionalInterface
interface Inf1
{
	void get(int i);
}


public class Demo1 {
	public static void main(String[] args) {
		/*Inf1 obj=new Inf1(){
			@Override
			public void get() {
				System.out.println("get of Inf1Impl");
			}
		};*/
		
		Inf1 obj=i->System.out.println("get of Inf1Impl"+i);
		obj.get(10);
		
		//Temp t=new Temp();
	
		Inf1 obj1=Temp::put;
		obj1.get(10);
		
		get(i->System.out.println("get of Inf1Impl"+i));
	}
	static void get(Inf1 i)
	{
		
	}
}
