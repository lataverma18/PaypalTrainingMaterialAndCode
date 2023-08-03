package com.coreproject.demos.oops.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class WorkStealingDemo {

	public static void main(String[] args) {
		
		FibonacciTask ft = new FibonacciTask(4);
		
		int parallelism = ForkJoinPool.getCommonPoolParallelism();
		System.out.println(parallelism);
		ForkJoinPool stealer = (ForkJoinPool) Executors.newWorkStealingPool(parallelism);
		System.out.println(stealer.invoke(ft));
	}
}

