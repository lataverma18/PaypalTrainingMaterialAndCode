package com.springcore.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.demo.Employee;
import com.springcore.demo.repository.EmployeeRepository;
@Component("es")
public class EmployeeService {
	@Autowired
	EmployeeRepository er;
	public ArrayList<Employee> getAllEmps()
	{
		return er.getList();
	}
	public String deleteById(int id)
	{
		return er.deleteById(id);
	}
}
