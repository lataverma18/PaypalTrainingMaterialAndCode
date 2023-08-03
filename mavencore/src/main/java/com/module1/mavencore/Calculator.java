package com.module1.mavencore;

public class Calculator {
	
TrigonometricOperations toperations;

public TrigonometricOperations getToperations() {
	return toperations;
}
public void setToperations(TrigonometricOperations toperations) {
	this.toperations = toperations;
}
public int sum(int a,int b)
{
	return a+b;
}
public int sub(int a,int b)
{
	return a-b;
}
public int getSinValue(int degree)
{
	return toperations.sin(degree);
	//return 1;
}
}
