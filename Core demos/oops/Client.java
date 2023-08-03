package com.coreproject.demos.oops;

public class Client {

	public static void main(String[] args) {
		Inf1 i1=new Inf1Impl();
		i1.get();
		i1.put();
		System.out.println(Inf1.i);
		
		Manager m1=new Manager();
		m1.setDepartment(DepartmentName.PAYROLL);
		m1.setEmployeeId(101);
		m1.setEmployeeName("Ronit");
		m1.setEmployeeSalary(50000);
		m1.display();
		
		
		System.out.println(m1.getDepartment().getTotalEmployees());
		
		Employee emp1=new Employee();
		emp1.setEmployeeId(101);
		emp1.setEmployeeName("Ronit");
		emp1.setEmployeeSalary(50000);
		
		Employee emp2=new Employee();
		emp2.setEmployeeId(101);
		emp2.setEmployeeName("Ronit");
		emp2.setEmployeeSalary(50000);
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		System.out.println(emp1.equals(emp2));
	}
}
