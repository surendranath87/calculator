package com.training.calctest;

import org.junit.Assert;
import org.junit.Test;

import com.training.calc.Calculator;

public class CalculatorTest {
	
	@Test
	public void testCalculate()
	{
		Assert.assertTrue("Pass",Calculator.calculate("add", 5, 5) == 10);
		Assert.assertTrue("Pass",Calculator.calculate("sub", 5, 5) == 0);
		Assert.assertTrue("Pass",Calculator.calculate("mul", 5, 5) == 25);
		Assert.assertTrue("Pass",Calculator.calculate("div", 5, 5) == 1);
	}

}
