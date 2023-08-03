package com.coreproject.demos.oops.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
			MyThread th=new MyThread();
			Thread th1=new Thread(th); //Thread-0
			
			Thread th2=new Thread(th);
			
			System.out.println(th1.getState());
			
			th1.start(); //Calls run()
			th2.start(); //Calls run()
			
			System.out.println(th1.getState());
			
			try {
				th1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("End of Main");
			System.out.println(th1.getState());
	}
}
