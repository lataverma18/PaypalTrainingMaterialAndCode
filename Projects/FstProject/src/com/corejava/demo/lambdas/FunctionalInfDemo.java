package com.corejava.demo.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInfDemo {

	public static void main(String[] args) {
		Supplier<Double> sup=()->Math.PI;
		System.out.println(sup.get());
		
		Consumer<String> con=str->System.out.println(str.length());
		con.accept("Lata");
		
		Predicate<String> p=str->str.length()>2;
		System.out.println(p.test("Lata"));
		
		Function<String,Character> fun=str->str.charAt(0);
		System.out.println(fun.apply("Lata"));
	}
}
