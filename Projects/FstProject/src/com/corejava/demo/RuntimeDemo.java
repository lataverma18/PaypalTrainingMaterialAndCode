package com.corejava.demo;

class MyFunc implements Runnable
{
	public void run()
	{
		System.out.println("JVM is getting ShutDown!!!");
	}
}
public class RuntimeDemo {
	public static void main(String[] args) {
		System.out.println("Start the Program!!!");
		Runtime rt=Runtime.getRuntime();
		MyFunc mf=new MyFunc();
		Thread th1=new Thread(mf);
		rt.addShutdownHook(th1);
		System.out.println("Ending the Program");
	}
}
