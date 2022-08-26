package com.springcore.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.demo.controllers.EmployeeController;
import com.springcore.demo.controllers.ProductController;

public class NewClient {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
		
		/*EmployeeController empc=(EmployeeController)ac.getBean("ec");
		
		empc.fetchAll().forEach(obj->System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getSalary()+"\t"+obj.getAddress()));
		System.out.println("--------------------------");
		System.out.println(empc.deleteEmp(102));
		System.out.println("--------------------------");
		empc.fetchAll().forEach(obj->System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getSalary()+"\t"+obj.getAddress()));*/
		
		SpelTestBean sb=(SpelTestBean)ac.getBean("spel");
		System.out.println(sb.getTestValue1());
		System.out.println(sb.isTestValue2());
		/*
		ProductController pc=(ProductController)ac.getBean("pc");
		
		Product p=new Product();
		p.setProductId(107);
		p.setProductName("Charger");
		p.setProductPrice(3500);
		System.out.println(pc.insertProduct(p));
		
		pc.getAllProducts().forEach(obj->System.out.println(obj.getProductId()+"\t"+obj.getProductName()+"\t"+obj.getProductPrice()));*/
	}
}
