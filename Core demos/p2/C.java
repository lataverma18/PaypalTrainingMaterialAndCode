package com.coreproject.demos.p2;

import com.coreproject.demos.oops.Employee;

public class C extends Employee{
	void get()
	{
		display();
	}
	
	//public C(){}	//Default Constructor Added by Compiler
	
	//Constructor Overloading
	
	  C(int i) { System.out.println("C Constructor!!!"+i); }
	  C(int i,int j) {
	  System.out.println("C Constructor!!!"+i+j); }
	 
}
