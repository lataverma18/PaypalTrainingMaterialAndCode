package com.corejava.demo.concurrency;

public class MyMain {

	public static void main(String[] args) {
		MyThread mt1=new MyThread(); 
		Thread th1=new Thread(mt1);//new
		th1.start();	//Runnable
		
		MyThread mt2=new MyThread();
		Thread th2=new Thread(mt2);
		th2.start();
		//Termination State
		System.out.println("End of Main");
	}
}
