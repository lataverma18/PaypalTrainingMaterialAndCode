package com.corejava.demo.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		LinkedHashMap hm=new LinkedHashMap();
		hm.put(10, "Ronit");
		hm.put(34, "Rahul");
		hm.put(10, "Ronit Sharma");
		hm.put(12, "Heena");
		hm.put(45, "Raj");

		System.out.println(hm);
	}
}
