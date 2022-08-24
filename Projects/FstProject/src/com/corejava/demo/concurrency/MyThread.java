package com.corejava.demo.concurrency;

public class MyThread implements Runnable {
	public void run()		//Running
	{	
		for(int i=1;i<=10;i++)
		System.out.println("Start:"+i);
	}
}
