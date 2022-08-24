package com.corejava.demo.collections;

import java.util.ArrayList;

class A1{}
class B1 extends A1{}
class C1 extends A1{}
class D1 extends B1{}
class E1 extends C1{}

public class GenericDemo2 {
	public static void main(String[] args) {
		ArrayList<A1> arr1=new ArrayList<>();
		ArrayList<B1> arr2=new ArrayList<>();
		ArrayList<C1> arr3=new ArrayList<>();
		ArrayList<D1> arr4=new ArrayList<>();
		ArrayList<E1> arr5=new ArrayList<>();
		ArrayList<Object> arr6=new ArrayList<>();
		
		ArrayList<? extends B1> arr=arr2;
		//arr.add(new D1());
		ArrayList<? super B1> ar=arr1;
		ar.add((B1)new A1());

	}
}
