package com.coreproject.demos.oops.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesDemo {
	public static void main(String[] args) {
		Supplier<Double> s=()->Math.PI;
		System.out.println(s.get());
		
		System.out.println("------------------------------");
		Consumer<String> c=System.out::println;
		c.accept("Lata");
		
		System.out.println("------------------------------");
		Predicate<String> p=str->str.length()>=3;
		System.out.println(p.test("Lata"));
		
		System.out.println("------------------------------");
		Function<String, Character> f=str->str.charAt(0);
		System.out.println(f.apply("Lata"));
		
		System.out.println("------------------------------");
		IntConsumer it=i->System.out.println(i+10);
		it.accept(10);
		
	}
}
