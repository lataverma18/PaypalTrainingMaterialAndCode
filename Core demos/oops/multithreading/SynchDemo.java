package com.coreproject.demos.oops.multithreading;

public class SynchDemo {

	public static void main(String[] args) {
		MachineRequest th1=new MachineRequest();
		MachineRequest th2=new MachineRequest();
		MachineRequest th3=new MachineRequest();
		
		th1.setName("Machine 1");
		th2.setName("Machine 2");
		th3.setName("Machine 3");
		
		th1.start();
		th2.start();
		th3.start();
	}
}
