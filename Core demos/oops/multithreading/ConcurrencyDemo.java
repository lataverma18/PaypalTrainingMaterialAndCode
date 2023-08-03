package com.coreproject.demos.oops.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrencyDemo {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(5);
		
		//Runnable runnableTask=()->System.out.println("Runnable Task of the Thread "+ Thread.currentThread().getName());
		Callable<String> callableTask=()->Math.PI+ Thread.currentThread().getName();
					
		for(int i=1;i<=20;i++)
		{
			Future<String> future=es.submit(callableTask);
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//es.execute(runnableTask);
		}
	}
}
