package com.corejava.demo.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo1 {

	public static void main(String[] args) {
		Runnable task=()->{
		for(int i=1;i<=20;i++)
		{
		System.out.println(i + Thread.currentThread().getName());
		}
		};
		//Runnable rTask=()->System.out.println("Hello");
		Callable<Double> ctask=()->Math.PI;
		int n=Runtime.getRuntime().availableProcessors();
		//ExecutorService es=Executors.newFixedThreadPool(n);
		//ExecutorService es=Executors.newCachedThreadPool();
		//ScheduledExecutorService es=Executors.newScheduledThreadPool(2);
		
		//es.scheduleWithFixedDelay(rTask, 2, 5, TimeUnit.SECONDS);
		ExecutorService es=Executors.newSingleThreadExecutor();
		for(int i=1;i<=5;i++)
		es.execute(task);
	}
}
