package com.corejava.demo;
//Java Bean
public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	private static String trainingTopic;
	private Address empAddress;		//Employee has - an Address

	public Address getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	static
	{
		trainingTopic="Core Java";
	}
	
	public static String getTrainingTopic() {
		return trainingTopic;
	}
	public static void setTrainingTopic(String trainingTopic) {
		Employee.trainingTopic = trainingTopic;
	}
	public Employee()
	{
		System.out.println("Employee is hired!!!");
	}
	public Employee(int empId)
	{
		this();
		this.empId=empId;
		System.out.println("Employee is constructed with Id:"+empId);
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
	/*public void getDetail(int id,String name,double salary)
	{
		empId=id;
		empName=name;
		empSalary=salary;
	}*/
	A display()
	{
		System.out.println(empId + "\t" + empName + "\t"+ empSalary);
		return null;
	}
}
