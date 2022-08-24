package com.corejava.demo.concurrency;

import java.util.concurrent.RecursiveTask;

public class FibonacciTask extends RecursiveTask<Integer>{
	final int n;
	public FibonacciTask(int n) {
		this.n=n;
	}
	@Override
	protected Integer compute() {
		if(n<=1)
			return n;
		FibonacciTask ft1=new FibonacciTask(n-1);
		ft1.fork();
		FibonacciTask ft2=new FibonacciTask(n-2);
		ft2.fork();
		return ft2.join()+ft1.join();
	}

}
