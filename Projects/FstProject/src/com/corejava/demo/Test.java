package com.corejava.demo;

public class Test {
final int j;
Test(int i)
{
	j=i;
}

	public static void main(String[] args) {
		final int i;
		 i=10;
		 System.out.println(i);
		 
		
		System.out.println("Hello World!!!");
		
		Employee emp=new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Ronit");
		emp.setEmpSalary(45000);
		Address ad1=new Address();
		ad1.setAddress("E-1304/50");
		ad1.setCity("Gurugram");
		ad1.setState("Haryana");
		ad1.setZipcode(122001);
		emp.setEmpAddress(ad1);
		System.out.println(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getEmpSalary());
		emp.setEmpSalary(48000);
		System.out.println(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getEmpSalary()+Employee.getTrainingTopic());
		

		
		Employee emp1=new Employee(102);
		emp1.setEmpName("Rahul");
		emp1.setEmpSalary(64000);
		System.out.println(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getEmpSalary()+Employee.getTrainingTopic());
		
		System.out.println("------------------------------------------------");
		
		Manager m=new Manager();
		m.setEmpId(101);
		m.setEmpName("Poonam");
		m.setEmpSalary(35000);
		m.setDepartment("IT");
		
		m.display();
		
		Animal d= new Dog();
		d.eatFood();
		d.sound();
		
		d=new Lion();
		d.eatFood();
		d.sound();
		
		Button b=new Laptop();
		b.on();
		b.off();
		System.out.println(Button.thikness);
		
	}
}
