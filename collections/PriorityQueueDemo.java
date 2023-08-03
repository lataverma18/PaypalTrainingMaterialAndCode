package com.coreproject.demos.collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		/*PriorityQueue<Employee> pq=new PriorityQueue<>(new SalaryComp());
		pq.add(new Employee(101,"Ronit",100000));
		pq.add(new Employee(102,"Gita",50000));
		pq.add(new Employee(103,"Rita",60000));
		pq.add(new Employee(104,"Rohit",75000));
		pq.add(new Employee(105,"Gaurav",200000));*/
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(101);
		pq.add(200);
		pq.add(150);
		pq.add(75);
		pq.add(250);
		
		while(!pq.isEmpty())
			System.out.println(pq.remove());
	}
}
