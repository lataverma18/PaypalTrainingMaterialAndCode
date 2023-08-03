package com.coreproject.demos.oops;

public class CloneDemo {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setEmployeeId(101);
		emp1.setEmployeeName("Ronit");
		emp1.setEmployeeSalary(50000);
		
		Employee emp2=emp1;

		Employee e=(Employee)emp1.clone();
		emp1.setEmployeeSalary(52000);
		e.display();
	}
}
