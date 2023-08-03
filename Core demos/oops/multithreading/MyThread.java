package com.coreproject.demos.oops.multithreading;

public class MyThread implements Runnable{// extends Thread{
	public void run()
	{
		System.out.println("MyThread's Task"+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ending MyThread's Task"+ Thread.currentThread().getName());
	}
}
