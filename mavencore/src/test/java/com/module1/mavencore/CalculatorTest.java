package com.module1.mavencore;

import static org.testng.Assert.assertEquals;

import org.mockito.Mockito;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

class CalculatorTest {
	Calculator c;
	@BeforeMethod
	void beforeMethod()
	{
		c=new Calculator();
	}
	@Test
	public void sumTest()
	{
//		Calculator c=new Calculator();
		int actualResult=c.sum(10, 20);
		int expectedResult=30;
		//assertEquals(expectedResult, actualResult);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(expectedResult, actualResult);
		System.out.println("End of Sum Test case");
		sa.assertAll();
	}
	@Test
	public void subTest()
	{
	//	Calculator c=new Calculator();
		int actualResult=c.sub(10, 20);
		int expectedResult=-10;
		assertEquals(expectedResult, actualResult);
	}
	@Test
	public void getSinValueTest()
	{ 
		//TrigonometricOperations to=new TrigonometricOperations();
		
		TrigonometricOperations tmock=Mockito.mock(TrigonometricOperations.class);
		//Stubbing a method
		Mockito.when(tmock.sin(90)).thenReturn(1);
		
		c.setToperations(tmock);
		int actualResult=c.getSinValue(90);
		int expectedResult=1;
		assertEquals(actualResult,expectedResult);
		
		Mockito.verify(tmock).sin(90);
	}
}
