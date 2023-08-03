package com.coreproject.demos.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		/*
		 * Map<Integer,String> m=new TreeMap<>(); m.put(101,"Ronit"); m.put(12,"Mita");
		 * m.put(105,"Nita"); m.put(12,"Rita"); m.put(89,"Raj");
		 */
		
		Map<Integer,String> m =Map.of(101, "Ronit", 102, "Nita", 103, "Jyoti");
		System.out.println(m);
	}
}
