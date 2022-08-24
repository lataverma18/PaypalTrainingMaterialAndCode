package com.corejava.demo;

public class Manager extends Employee{
	private String department;

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public  D display()		//Covariant Return Type
	{
		super.display();
		System.out.println(department);
		return null;
	}
}
