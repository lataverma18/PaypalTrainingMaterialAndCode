package com.springcore.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.springcore.demo.Product;
import com.springcore.demo.ProductRowMapper;

@Component("pr")
public class ProductRepository {
	@Autowired
	JdbcTemplate jdt;
	@Autowired
	DriverManagerDataSource ds;
	@Autowired
	ProductRowMapper prm;
	
	public ProductRepository()
	{
		System.out.println(jdt);
		System.out.println(ds);
		jdt.setDataSource(ds);
	}
	
	public List<Product> getAllProducts()
	{
		String sql="select * from Product";
		
		return jdt.query(sql, prm);
	}
}
