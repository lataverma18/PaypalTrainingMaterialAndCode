package com.demo.springcore;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.springcore.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
    	ac.registerShutdownHook();
    	
    //	Employee e=(Employee)ac.getBean("emp1");
    	Employee e=ac.getBean(Employee.class);
    	e.greet();
    	System.out.println(e);
    	
    	Employee e1=ac.getBean(Employee.class);
    	System.out.println(e1);
    	
    	
    	
    }
}
