package com.coreproject.demos.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {
	public static void main(String[] args) {
		List<Integer> list=List.of(10,30,50,70,90,56,11);
		
		Stream<Integer> st=list.stream();
		st.forEach(i->System.out.println(i));
		list.stream().forEach(i->System.out.println(i));
		System.out.println("------------------");
		list.stream().limit(4).forEach(System.out::println);
		System.out.println("------------------");
		list.stream().filter(i->i>=30).forEach(System.out::println);
		System.out.println("------------------");
		List<Integer> l=list.stream().filter(i->i>=30).collect(Collectors.toList());
		System.out.println(l);
		
		System.out.println("------------------");
		list.stream().takeWhile(i->i<=50).forEach(System.out::println);
		System.out.println("------------------");
		list.stream().dropWhile(i->i<=50).forEach(System.out::println);
		Stream.iterate(1, i->i+1).limit(10).forEach(System.out::println);
		Stream.iterate(1,i->i<=10 ,i->i+1).forEach(System.out::println);
		Stream stream=Stream.ofNullable(null);
		System.out.println(stream.count());
		
	}
}
