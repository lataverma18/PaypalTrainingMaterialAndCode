package com.corejava.demo;

public class StringDemo {

	public static void main(String[] args) {
		String str1="Lata";			//Literal Notation
		String str2="Lata";
		String str3=new String("Lata");		//Object Notation
		String str4=new String("Lata");	

		System.out.println(str1==str2);
		System.out.println(str3==str4);
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		
		str1.concat(" Verma");
		System.out.println(str1);
		
		
		StringBuffer sb=new StringBuffer(str1);
		sb.append(" Verma");
		System.out.println(sb);
		
		
	}
}
