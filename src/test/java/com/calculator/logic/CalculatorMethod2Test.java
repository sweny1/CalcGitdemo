package com.calculator.logic;

import org.junit.Test;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CalculatorMethod2Test {

	@Test
	public void AddtionPass() {
		ICalculator objCalculatorMethod2 = new Addition();
		Assert.assertEquals("Addition Succeed",35.0f , objCalculatorMethod2.performOperation(15,20));	
	}
	
	@Test
	public void AddtionFail() { 
		ICalculator objCalculatorMethod2 = new Addition();
		Assert.assertEquals("Addition failed",30.0 , objCalculatorMethod2.performOperation(15,20));	
	}
	
	@Test
	public void SubtractionPass() {	
		ICalculator objCalculatorMethod2 = new Subtraction();
		Assert.assertEquals("Subtraction Succeed",5.0 , objCalculatorMethod2.performOperation(15, 10));	
	}
	

	@Test
	public void SubtractionFail() {	
		ICalculator objCalculatorMethod2 = new Subtraction();
		Assert.assertEquals("Subtraction failed",-5.0 , objCalculatorMethod2.performOperation(15, 10));	
	}
	
	@Test
	public void MultiplicationPass() {	
		ICalculator objCalculatorMethod2 = new Multiplication();
		Assert.assertEquals("Mutiplication Succeed",150.0 , objCalculatorMethod2.performOperation(15, 10));	
	}
	

	@Test
	public void MultiplicationFail() {	
		ICalculator objCalculatorMethod2 = new Multiplication();
		Assert.assertEquals("Mutiplication failed",5.0 , objCalculatorMethod2.performOperation(15, 10));	
	}
	
	@Test
	public void DivisionPass() {	
		ICalculator objCalculatorMethod2 = new Division();
		Assert.assertEquals("Divison Succeed",5.0 , objCalculatorMethod2.performOperation(15, 3));	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZeroMethod2() {	
		ICalculator objCalculatorMethod2 = new Division();
		objCalculatorMethod2.performOperation(15, 0);	
	}
	

	@Test
	public void DivisionFail() {	
		ICalculator objCalculatorMethod2 = new Division();
		Assert.assertEquals("Divison failed",5.0 , objCalculatorMethod2.performOperation(15, 10));	
	}
	

}
