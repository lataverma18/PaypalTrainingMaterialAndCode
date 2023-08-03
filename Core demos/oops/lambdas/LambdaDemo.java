package com.coreproject.demos.oops.lambdas;

public class LambdaDemo {

	public static void main(String[] args) {
		//Anonymous Class
		/*
		 * Inf1 i1=new Inf1(){
		 * 
		 * @Override public void get() 
		 * { 
		 * System.out.println("get of Inf1Impl"); 
		 * } 
		 * };
		 */
		
		Inf1 i1=i->System.out.println("get of Inf1Impl"+i);

		i1.get(10);
		}
}
