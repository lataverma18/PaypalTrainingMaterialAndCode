package com.demo.springcore.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("sp1")
//@Profile("dev,default")
public class SpELDemo {
	private String value1;
	private String value2;
	public String getValue1() {
		return value1;
	}
	@Value("#{emp1.empName}")
	public void setValue1(String value1) {
		this.value1 = value1;
	}
	
	public String getValue2() {
		return value2;
	}
	@Value("#{T(java.lang.Math).random()*100}")
	public void setValue2(String value2) {
		this.value2 = value2;
	}
	@Override
	public String toString() {
		return "SpELDemo [value1=" + value1 + ", value2=" + value2 + "]";
	}
}
