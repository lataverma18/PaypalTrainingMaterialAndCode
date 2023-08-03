package com.coreproject.demos.collections;

import java.util.ArrayList;

class A
{}
class B extends A{}
class C extends A{}
class D extends C{}
public class GenericsPECSDemo {

	public static void main(String[] args) {
		ArrayList<C> arr1=new ArrayList<>();
		arr1.add(new C());
		ArrayList<? super C> arr=arr1;
		arr.add(new D());
	}

}
