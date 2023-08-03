package com.coreproject.demos.oops;

public class ExecutorClass {

	public static void main(String[] args) {

		
		EmployeeCommonDetails ecd[]=new EmployeeCommonDetails[10];
		ecd[0]=new ManagerDetails();
		ecd[1]=new DevelopersDetails();
		
		final int var1;
		
		var1=10;
		
		Manager mgr1=new Manager();
		
		mgr1.setTrainingTechnology("Java");
		mgr1.setEmployeeId(111);
		mgr1.setEmployeeName("Rajiv");
		mgr1.setEmployeeSalary(89000);
		mgr1.setDepartment("Production");
		
		mgr1.display();
		
		Manager mgr2=new Manager(112);
		
		mgr2.setTrainingTechnology("Java");
		//mgr2.setEmployeeId(101);
		mgr2.setEmployeeName("Raj");
		mgr2.setEmployeeSalary(80000);
		mgr2.setDepartment("QA");
		
		mgr2.display();
		
		mgr2.trial();
		
		Employee emp1=new Manager();
		emp1.display();
		emp1.trial();
		
		Manager mgr=(Manager)emp1;
		//Manager mgr=(Manager)new Employee(10);
	}
}
