package com.coreproject.demos.oops;

public enum DepartmentName {
PRODUCTION(15),QA(20),SALES(25),PAYROLL(10);
	
private int totalEmployees;
private DepartmentName(int totalEmployees) {
	this.totalEmployees=totalEmployees;
}
public int getTotalEmployees() {
	return totalEmployees;
}
public void setTotalEmployees(int totalEmployees) {
	this.totalEmployees = totalEmployees;
}

}
