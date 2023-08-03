package com.coreproject.demos.oops;
// Employee Bean
public class Employee implements Cloneable{
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private static String trainingTechnology;
	
	public Object clone()
	{
		Object obj=null;
		try {
			obj=super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	public int hashCode()
	{
		return employeeId+employeeName.length();
	}
	public boolean equals(Object obj)
	{
		Employee emp=(Employee)obj;
		if(this.employeeId==emp.employeeId && this.employeeName.equals(emp.employeeName) && this.employeeSalary==emp.employeeSalary)
			return true;
		else
			return false;
	}
	public  Employee() { System.out.println("Hiring the Employee!!!"); }
	
	public Employee(int employeeId){
		//this();
		this.employeeId=employeeId;
	}
	static
	{
		trainingTechnology="Java";
		System.out.println("Hello Everyone!!!");
	}
	
	public static String getTrainingTechnology() {
		return trainingTechnology;
	}

	public static void setTrainingTechnology(String trainingTechnology) {
		Employee.trainingTechnology = trainingTechnology;
	}
	
	static void trial()
	{
		System.out.println("Trial of Employee!!!");
	}

	protected void display()
	{
		System.out.print(getEmployeeId()+"\t"+getEmployeeName()+"\t"+getEmployeeSalary()+"\t"+trainingTechnology);
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}
