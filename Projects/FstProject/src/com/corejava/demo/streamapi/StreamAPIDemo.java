package com.corejava.demo.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo {
	public static void main(String []args)
	{
		List<Integer> arrList=new ArrayList<>();
		arrList.add(10);
		arrList.add(50);
		arrList.add(30);
		arrList.add(140);
		arrList.add(20);
		arrList.add(140);
		System.out.println(arrList);
		
		//arrList.forEach(a->System.out.println(a));
		arrList.stream().filter(s->s>50).forEach(a->System.out.println(a));
		System.out.println("---------------");
		arrList.stream().distinct().limit(3).forEach(a->System.out.println(a));
		System.out.println(arrList.stream().anyMatch(s->s>200));
		System.out.println("---------------");
		arrList.stream().sorted().forEach(a->System.out.println(a));
		
	/*	int []arr=new int[10];
		Arrays.stream(arr).*/
	}
}
