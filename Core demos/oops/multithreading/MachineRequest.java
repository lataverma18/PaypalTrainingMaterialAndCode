package com.coreproject.demos.oops.multithreading;

public class MachineRequest extends Thread{
	static Printer p=new Printer();
	public void run()
	{
		synchronized(p)
		{
			p.printing();
		}
	}
}
