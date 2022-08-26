package com.springcore.demo;

import java.util.ArrayList;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages= {"com.springcore.demo","com.springcore.demo.controllers","com.springcore.demo.repository","com.springcore.demo.services"})

public class MyConfig {
	@Bean("arrL")
	//@Scope("prototype")
	public ArrayList<Employee> getArrayList()
	{
		ArrayList<Employee> all=new ArrayList<>();
		all.add(new Employee(101,"Ronit",34000,null));
		all.add(new Employee(102,"Rahul",38000,null));
		all.add(new Employee(103,"Heena",40000,null));
		return all;
	}
	
	@Bean("ds")
	public DriverManagerDataSource getDs()
	{
		DriverManagerDataSource drms=new DriverManagerDataSource();
		drms.setDriverClassName("org.postgresql.Driver");
		drms.setUrl("jdbc:postgresql://localhost:5432/TempDB");
		drms.setUsername("postgres");
		drms.setPassword("system");
		return drms;
	}
	@Bean("jdt")
	public JdbcTemplate jdt(DriverManagerDataSource ds)
	{
		JdbcTemplate jt=new JdbcTemplate(ds);
		return jt;
	}
	@Bean("prm")
	public ProductRowMapper getRowMapper()
	{
		return new ProductRowMapper();
	}
	@Bean("p")
	//@Scope("prototype")
	public Product getProduct()
	{
		Product p=new Product();
		return p;
	}
}
