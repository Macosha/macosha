package com.luxoft.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNg {
  @Test
  public void f() {
	  System.out.println("first test");
  }
  
  @BeforeMethod
  public void setUp()
  {
	  System.out.println("in before method");
  }
}
