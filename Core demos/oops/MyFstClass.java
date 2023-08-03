package com.coreproject.demos.oops;



public class MyFstClass {
	
	
	static
	{
		System.out.println("Some Imp Task!!!");
	}
	public static void main(String[] args) {
	//Employee.setTrainingTechnology("Java");
		
	//System.out.println(args[4]);
		
	
	Employee emp1=new Employee();
	
	System.out.println("Starting of Main Method!!!");
	emp1.setEmployeeId(101);
	emp1.setEmployeeName("Ronit");
	emp1.setEmployeeSalary(45000);
	
	emp1.display();
	
	Employee emp2=new Employee(102);
	
	
	emp2.setEmployeeName("Rahul");
	emp2.setEmployeeSalary(45000);
	
	emp2.display();
	
	//emp2.trainingTechnology="Spring";
	//Employee.trainingTechnology="Spring";
	Employee.setTrainingTechnology("Spring");
	
	emp1.display();
	emp2.display();
	
	System.out.println(Math.pow(2, 3));
	}
}

