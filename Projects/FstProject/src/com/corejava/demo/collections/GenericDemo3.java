package com.corejava.demo.collections;

import java.util.ArrayList;

class Fruit{}
class Apple extends Fruit{}
class AsianApple extends Fruit{}
class Mango extends Fruit{}

public class GenericDemo3 {
	public static void main(String[] args) {
		ArrayList<Apple> list1=new ArrayList<>();
		list1.add(new Apple());
		list1.add(new Apple());
		ArrayList<AsianApple> list2=new ArrayList<>();
		ArrayList<Mango> list3=new ArrayList<>();
		ArrayList<Fruit> list4=new ArrayList<>();
		
		ArrayList<? super Fruit> basket=list4;
		for(Fruit f: basket)
			System.out.println(f);
		
		ArrayList<?> arrO=list1;
		/*arrO.add(new Apple());
		arrO.add(new Object());
		arrO.add(new Fruit());*/
		
	}
}
