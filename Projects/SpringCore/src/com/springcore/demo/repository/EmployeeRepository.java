package com.springcore.demo.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.demo.Employee;

@Component("er")
public class EmployeeRepository {
	@Autowired
	ArrayList<Employee> arrList;
	
	public ArrayList<Employee> getList()
	{
		return arrList;
	}
	public String deleteById(int id)
	{
		for(Employee emp:arrList)
		{
			if(emp.getId()==id)
				arrList.remove(emp);
		}
		return "Employee deleted successfully with Id:"+id;
	}
}
