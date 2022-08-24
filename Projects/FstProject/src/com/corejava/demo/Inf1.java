package com.corejava.demo;

@FunctionalInterface
public interface Inf1
{
	void get();
	default void put(){}
}
