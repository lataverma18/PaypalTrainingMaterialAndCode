package com.demo.springcore;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.springcore.beans.Employee;
import com.demo.springcore.beans.MyConfig;
import com.demo.springcore.beans.SpELDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//AbstractApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
    	ApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
    	//ac.registerShutdownHook();
		
		/* ac.getEnvironment().setActiveProfiles("dev"); */  
		 //ac.refresh(); 
		 
    	
    //	Employee e=(Employee)ac.getBean("emp1");
    	Employee e=ac.getBean(Employee.class);
    	e.greet();
    	System.out.println(e);
    	
    	Employee e1=ac.getBean(Employee.class);
    	System.out.println(e1);
    	
    	SpELDemo sp1=ac.getBean(SpELDemo.class);
    	System.out.println(sp1);
    }
}
