package com.coreproject.demos.oops;

public abstract class EmployeeCommonDetails {
	private int empCode;
	private String empDOJ;
	private String empName;
	
	abstract void get();
	
	public EmployeeCommonDetails() {
		System.out.println("Constrcutor of Abstract Class!!!");
	}
	
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public String getEmpDOJ() {
		return empDOJ;
	}
	public void setEmpDOJ(String empDOJ) {
		this.empDOJ = empDOJ;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
