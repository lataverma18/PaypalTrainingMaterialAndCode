package com.springcore.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.demo.controllers.EmployeeController;

public class NewClient {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
		
		EmployeeController empc=(EmployeeController)ac.getBean("ec");
		
		empc.fetchAll().forEach(obj->System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getSalary()+"\t"+obj.getAddress()));
		System.out.println("--------------------------");
		System.out.println(empc.deleteEmp(102));
		System.out.println("--------------------------");
		empc.fetchAll().forEach(obj->System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getSalary()+"\t"+obj.getAddress()));
	}
}