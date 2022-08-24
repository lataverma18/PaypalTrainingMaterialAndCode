package com.springcore.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Client {

	public static void main(String[] args) {
		//BeanFactory bf=new XmlBeanFactory(new FileSystemResource("src\\config.xml"));
		BeanFactory bf=new XmlBeanFactory(new ClassPathResource("config.xml"));
		//ApplicationContext bf=new ClassPathXmlApplicationContext("config.xml");
		Employee e=(Employee)bf.getBean("emp1");		//downcasting
		Employee e1=(Employee)bf.getBean("emp1");
		Employee e2=(Employee)bf.getBean("emp1");
		//Employee e=bf.getBean(Employee.class);
		e.greet();
		System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()+"\t Address: "+e.getAddress().getAddress()+"\t"+e.getAddress().getCity()+"\t"+e.getAddress().getState()+"\t"+e.getAddress().getZipcode());
	}
}
