package com.coreproject.demos.oops;

public class Manager extends Employee{
	private DepartmentName department;
	
	/*
	 * public Manager(){ super(); }
	 * 
	 */
	Manager(){
		//super();
		super(111);
		System.out.println("Hello");		
	}
	Manager(int i)
	{
		//super();
		this();
		System.out.println(i);
	}
	
	public DepartmentName getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentName department) {
		this.department = department;
	}
	//Method Hiding not Overriding
	static void trial()
	{
		System.out.println("Trial of Manager!!!");
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("\t"+department);
	}
}
