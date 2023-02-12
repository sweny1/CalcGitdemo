package com.calculator.logic;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CalculatorMethod1Test {
	public CalculatorMethod1 objCalculatorMethod1;

	@Before
	public void setUp() {
		// Arrange
		objCalculatorMethod1 = new CalculatorMethod1();
	}

	@Test
	public void TestAddTrue() {
		Assert.assertEquals("Addition Succeed", 35.0f, objCalculatorMethod1.Add(15, 20));
	}

	@Test
	public void TestAddFalse() {
		Assert.assertEquals("Addition failed", 35, objCalculatorMethod1.Add(15, 20));
	}

	
	@Test
	public void TestSubTrue() {
	Assert.assertEquals("Subtraction Succeed", 5.0f , objCalculatorMethod1.Sub(15, 10));
	}


	@Test
	public void TestSubFalse() {
	Assert.assertEquals("Subtraction failed", -5.0f, objCalculatorMethod1.Sub(15, 10));
	}

	@Test
	public void TestMulTrue() {
		Assert.assertEquals("Mutiplication Succeed", 150.0f , objCalculatorMethod1.Mul(15, 10));
	}


	@Test
	public void TestMulFalse() {
		Assert.assertEquals("Mutiplication failed", 5.0f, objCalculatorMethod1.Mul(15, 10));
	}

	@Test
	public void TestDivTrue() {
		Assert.assertEquals("Divison Succeed", 5.0 , objCalculatorMethod1.Div(15, 3));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZeroMethod1() {
		objCalculatorMethod1.Div(15, 0);
	}

	@Test
	public void TestDivFasle() {
		Assert.assertEquals("Divison failed", 5.0, objCalculatorMethod1.Div(15, 10));
	}

}
