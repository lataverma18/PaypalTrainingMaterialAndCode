package com.coreproject.demos.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		/*
		 * ArrayList<Integer> arr=new ArrayList<>(); arr.add(10); arr.add("Hello");
		 * arr.add(14.6); arr.add(10); arr.add('C');
		 */
		
		/*
		 * Set<Integer> s=new TreeSet<>(); s.add(10); s.add(40); s.add(90); s.add(10);
		 * s.add(50); System.out.println(s);
		 */
		
		Set<Integer> s=Set.of(10,40,90,50);
		
		Iterator it=s.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	}
}
