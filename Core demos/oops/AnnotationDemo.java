package com.coreproject.demos.oops;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class UseAnno
{
	@MyFstAnnotation(value=34)
	public void applyAnnotation()
	{
		System.out.println("applyAnnotation of UseAnno");
	}
}
public class AnnotationDemo {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
	//Class classObj=Class.forName("com.coreproject.demos.oops.UseAnno");
	
	UseAnno ua=new UseAnno();
	Class classObj=ua.getClass();
	Method m=classObj.getMethod("applyAnnotation");
	MyFstAnnotation manno=m.getAnnotation(MyFstAnnotation.class);
	System.out.println(manno.value());
	}
}
