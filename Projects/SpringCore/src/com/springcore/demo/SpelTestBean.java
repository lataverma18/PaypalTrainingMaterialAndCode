package com.springcore.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spel")
public class SpelTestBean {
	private int testValue1;
	private boolean testValue2;
	public int getTestValue1() {
		return testValue1;
	}
	//@Value("#{emp1.getId()}")
	//@Value("#{T(java.lang.Math).random()*100}")  //0.5467378 *100= 54.67378
	@Value("#{arrL[2].id}")
	public void setTestValue1(int testValue1) {
		this.testValue1 = testValue1;
	}
	public boolean isTestValue2() {
		return testValue2;
	}
	//@Value("#{emp1.salary>50000 && emp1.id!=0}")
	@Value("#{emp1.name matches 'R.*'}")
	public void setTestValue2(boolean testValue2) {
		this.testValue2 = testValue2;
	}
}
