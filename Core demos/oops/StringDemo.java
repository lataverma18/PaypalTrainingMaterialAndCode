package com.coreproject.demos.oops;

public class StringDemo {

	public static void main(String[] args) {
		String str1="Hello";		//SCP
		String str2="hello";		//SCP
		System.out.println(str1==str2);
		String str3=new String("Hello");		//Heap
		String str4=new String("Hello");
		System.out.println(str3==str4);
		
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str3.equals(str4));
		
		System.out.println(str1.compareToIgnoreCase(str2));

		String date="09/08/2019";
		String []arr=date.split("/");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		String str="Hello";
		str=str.concat(" World");
		System.out.println(str);
		
		StringBuilder sb=new StringBuilder("Hello");
		sb.append(" World!!!");
		System.out.println(sb);
		
		
		
	}
}
