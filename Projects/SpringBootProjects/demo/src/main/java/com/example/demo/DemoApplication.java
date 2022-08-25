package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entities.Employee;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public ArrayList<Employee> getArrayList()
	{
		ArrayList<Employee> all=new ArrayList<>();
		all.add(new Employee(101,"Ronit",34000));
		all.add(new Employee(102,"Rahul",38000));
		all.add(new Employee(103,"Heena",40000));
		return all;
	}
}
