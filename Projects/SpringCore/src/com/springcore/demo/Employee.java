package com.springcore.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp1")
@Scope(value="prototype")
@PropertySource(value = { "myproperty.properties" })
//employee
public class Employee {
	private int id;
	private String name;
	private int salary;
	private Address address;
	public Employee(){System.out.println("Employee Constructor!!!");}

	public Employee(int id, String name, int salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}



	public int getId() {
		return id;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	@Value("${emp.id}")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("${emp.name}")
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	@Value("${emp.salary}")
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void greet()
	{
		System.out.println("Hello Everyone, Welcome to Paypal!!!");
	}
}
