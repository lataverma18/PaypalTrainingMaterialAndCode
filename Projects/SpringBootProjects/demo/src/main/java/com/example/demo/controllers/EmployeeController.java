package com.example.demo.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeService;
@RestController
@RequestMapping("/api")
public class EmployeeController{
	
	@Autowired
	EmployeeService es;
	
	@GetMapping("/employees")
	public List<Employee> getAll()
	{
		List<Employee> emps=es.getAllEmps();
		emps.forEach(obj->{
			obj.add(linkTo(methodOn(EmployeeController.class).fetchById(obj.getId())).withSelfRel());
		});
			
		return emps;
	}
	@DeleteMapping("/employees/{id}")		//PathVariable -id
	public String deleteById(@PathVariable("id") int eid)
	{
		return es.deleteById(eid);
	}
	
	@GetMapping("/employees/{id}")		//PathVariable -id
	public ResponseEntity<Employee> fetchById(@PathVariable("id") int eid)
	{
		Employee emp=es.fetchById(eid);
		emp.add(linkTo(methodOn(EmployeeController.class).getAll()).withSelfRel());
		
		if(emp!=null)
			return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		else
			return new ResponseEntity<Employee>(emp,HttpStatus.NOT_FOUND);
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
