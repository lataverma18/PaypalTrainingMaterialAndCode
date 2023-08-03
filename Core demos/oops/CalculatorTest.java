package com.coreproject.demos.oops;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CalculatorTest {
  @Test
  public void f() {
	  assertEquals(new Calculator().sum(10, 20), 30);
  }
}
