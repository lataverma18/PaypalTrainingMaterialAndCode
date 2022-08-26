package com.springcore.demo.repository;

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
	DriverManagerDataSource ds;
	@Autowired
	JdbcTemplate jdt;
	@Autowired
	ProductRowMapper prm;
	
	
	public List<Product> getAllProducts(){
		return jdt.query("select * from Product", prm);
	}
	public String insertProduct(Product p)
	{
		String query="insert into Product values(?,?,?)";
		
		int i=jdt.update(query,p.getProductId(),p.getProductName(),p.getProductPrice());
		if(i>0)
			return "Updated Successfully!!!";
		else
			return "Problem in Updation!!!";
	}
}
