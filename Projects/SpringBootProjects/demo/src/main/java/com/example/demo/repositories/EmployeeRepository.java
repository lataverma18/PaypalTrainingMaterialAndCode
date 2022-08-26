package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employee;

@Repository("er")
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
	public Employee fetchById(int id)
	{
		/*
		 * Optional<Employee>
		 * op=arrList.stream().filter(obj->obj.getId()==id).findAny();
		 * if(op.isPresent()) return op.get(); else return null;
		 */
		for(Employee emp:arrList)
		{
			if(emp.getId()==id)
				return emp;
		}
			return null;
	}
	public String updateById(Employee emp)
	{
		for(Employee temp:arrList)
		{
			if(temp.getId()==emp.getId())
			{
				int index=arrList.indexOf(temp);
				arrList.remove(index);
				arrList.add(index, emp);
				return "Record Updated Successfully!!!";
			}
		}
		return "Updation is not possible!!!";
	}
	public String insertEmp(Employee emp)
	{
		arrList.add(emp);
		return "Inserted Successfully!!!";
	}
}
