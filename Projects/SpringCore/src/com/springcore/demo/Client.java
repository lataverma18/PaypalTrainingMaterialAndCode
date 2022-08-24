package com.springcore.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Client {

	public static void main(String[] args) {
		//BeanFactory bf=new XmlBeanFactory(new FileSystemResource("src\\config.xml"));
		//BeanFactory bf=new XmlBeanFactory(new ClassPathResource("config.xml"));
		//ApplicationContext bf=new ClassPathXmlApplicationContext("config.xml");
		ApplicationContext bf=new AnnotationConfigApplicationContext(MyConfig.class);
		Employee e=(Employee)bf.getBean("emp1");		//downcasting
		//Employee e=bf.getBean(Employee.class);
		e.greet();
		
		ArrayList al=bf.getBean(ArrayList.class);
		System.out.println(al);
		ArrayList al1=bf.getBean(ArrayList.class);
		System.out.println(al1);
		System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()+"\t"+e.getAddress().getAddress()+"\t"+e.getAddress().getCity()+"\t"+e.getAddress().getState()+"\t"+e.getAddress().getZipcode());
	}
}
