package com.springcore.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//Advice - what code is to be executed , Before ,After...
//PointCut -When

@Component
@Aspect
@EnableAspectJAutoProxy
public class CommonCodeClass {	
	@Before("execution(private void test())")
	public void common()
	{
		System.out.println("My Common Code");
		//Log statements
		//Authentication 
		//Authorization
		//Security
	}
}
