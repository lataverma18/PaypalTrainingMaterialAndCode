package com.springcore.demo;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages= {"com.springcore.demo","com.springcore.demo.controllers","com.springcore.demo.repository","com.springcore.demo.services"})

public class MyConfig {
	
	@Bean
	//@Scope("prototype")
	public ArrayList<Employee> getArrayList()
	{
		ArrayList<Employee> all=new ArrayList<>();
		all.add(new Employee(101,"Ronit",34000,null));
		all.add(new Employee(102,"Rahul",38000,null));
		all.add(new Employee(103,"Heena",40000,null));
		return all;
	}
}