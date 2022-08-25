package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepository;


@Service("es")
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
	public Employee fetchById(int id)
	{
		return er.fetchById(id);
	}
	public String updateById(Employee emp)
	{
		return er.updateById(emp);
	}
	public String insertEmp(Employee emp)
	{
		return er.insertEmp(emp);
	}
}
