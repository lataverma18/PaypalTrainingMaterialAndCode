package com.springcore.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.demo.Product;
import com.springcore.demo.services.ProductService;

@Component("pc")
public class ProductController {
	@Autowired
	ProductService ps;
	
	public List<Product> getAllProducts(){
		return ps.getAllProducts();
	}
	public String insertProduct(Product p)
	{
		return ps.insertProduct(p);
	}
}
