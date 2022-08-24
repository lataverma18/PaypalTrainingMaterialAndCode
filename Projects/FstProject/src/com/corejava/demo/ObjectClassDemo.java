package com.corejava.demo;

class Emp
{
	int id;
	String name;
	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public boolean equals(Object obj)		//Object obj=x2; //Upcasting
	{
		Emp emp=(Emp)obj;
		if(this.id==emp.id && this.name.equals(emp.name))
			return true;
		else
			return false;
	}
}
public class ObjectClassDemo {

	public static void main(String[] args) {
	Emp x1=new Emp(101,"Ronit");
	Emp x2=new Emp(101,"Ronit");
	System.out.println(x1.getClass());

	System.out.println(x1.hashCode());
	System.out.println(x1);
	
	System.out.println(x2.hashCode());
	System.out.println(x2);
	
	System.out.println(x1.equals(x2));
	}
}
