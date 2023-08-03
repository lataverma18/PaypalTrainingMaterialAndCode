package com.coreproject.demos.oops;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class A
{
	private void get(int i)
	{
		System.out.println(i);
	}
}
public class ReflectionAPIDemo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Class objClass=Class.forName("com.coreproject.demos.oops.A");
	Object obj=objClass.newInstance();
	Method methods[]=objClass.getDeclaredMethods();

	for(Method method:methods)
	{
		System.out.println("Name is:"+method.getName());
		System.out.println("Parameters is:"+method.getParameterCount());
		System.out.println("Modifiers is:"+method.getModifiers());
		method.setAccessible(true);
		method.invoke(obj, 10);
	}
	
	}
}
