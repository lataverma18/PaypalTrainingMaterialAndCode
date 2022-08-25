package com.springcore.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.demo.Product;
import com.springcore.demo.repository.ProductRepository;

@Component("ps")
public class ProductService {
	@Autowired
	ProductRepository pr;
	
	public List<Product> getAllProducts(){
	return pr.getAllProducts();
}
}
