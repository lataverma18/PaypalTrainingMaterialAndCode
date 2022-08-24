package com.springcore.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.demo.Employee;
import com.springcore.demo.services.EmployeeService;

@Component("ec")
public class EmployeeController {
	@Autowired
	EmployeeService es;
	
	public ArrayList<Employee> fetchAll()
	{
		return es.getAllEmps();
	}
	public String deleteEmp(int id)
	{
		return es.deleteById(id);
	}

}
