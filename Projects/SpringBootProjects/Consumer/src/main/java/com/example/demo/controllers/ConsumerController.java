package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entities.Employee;

@RestController
@RequestMapping("/cosumersapi")
public class ConsumerController {
	@Autowired
	RestTemplate rt;
	String uri="http://localhost:8085/api/employees";
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return Arrays.asList(rt.getForObject(uri, Employee[].class));
	}
	@DeleteMapping("/employees/{id}")	
	public String deleteById(@PathVariable("id") int eid)
	{
		rt.delete(uri+"/"+eid);
		return "Deleted Successfully!!!";
	}
	@GetMapping("/employees/{id}")		//PathVariable -id
	public Employee fetchById(@PathVariable("id") int eid)
	{
		return rt.getForObject(uri+"/"+eid,Employee.class);
	}
	@PutMapping("/employees/{id}")		//PathVariable -id
	public String updateById(@PathVariable("id") int eid,@RequestBody Employee obj)
	{
		rt.put(uri+"/"+eid, obj);
		return "Updated Successfully!!!";
	}
	@PostMapping("/employees")
	public String insertEmp(@RequestBody Employee obj)
	{
		return rt.postForObject(uri, obj, String.class);
	}
	@ExceptionHandler(HttpClientErrorException.class)
	public ResponseEntity<String> handlingException(HttpClientErrorException he)
	{
		return new ResponseEntity<>(he.getMessage(),HttpStatus.NOT_FOUND);	
	}
}
