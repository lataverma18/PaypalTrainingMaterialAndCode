package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	
	@GetMapping("/employees")
	public List<Employee> getAll()
	{
		return es.getAllEmps();
	}
	@DeleteMapping("/employees/{id}")		//PathVariable -id
	public String deleteById(@PathVariable("id") int eid)
	{
		return es.deleteById(eid);
	}
	@GetMapping("/employees/{id}")		//PathVariable -id
	public Employee fetchById(@PathVariable("id") int eid)
	{
		return es.fetchById(eid);
	}
	@PutMapping("/employees/{id}")		//PathVariable -id
	public String updateById(@PathVariable("id") int eid,@RequestBody Employee obj)
	{
		if(eid==obj.getId())
			return es.updateById(obj);
		else
			return "Id in Path and in request does not match!!!";
	}
	@PostMapping("/employees")
	public String insertEmp(@RequestBody Employee obj)
	{
		return es.insertEmp(obj);
	}
}
