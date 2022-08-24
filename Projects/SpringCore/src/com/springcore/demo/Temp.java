package com.springcore.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("t")
public class Temp {
	int i;
	@Value("101")
	public void setI(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
}
