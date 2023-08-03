package com.coreproject.demos.oops;


sealed class A1 permits B1
{
	
}
non-sealed class B1 extends A1
{
	
}
class C1 extends B1
{

}
public class SealedClassDemo {

	public static void main(String[] args) {

	}
}
