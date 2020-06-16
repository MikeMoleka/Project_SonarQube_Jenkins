package com.formation.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.formation.bank.InterestCalculator;
import com.formation.bank.SimpleInterestCalculator;

public class SimpleInterestCalculatorJunit4Test {
	 InterestCalculator interestCalculator;
	
	@Before
	public void init() {
		interestCalculator = new SimpleInterestCalculator();
		interestCalculator.setRate(0.05);
	}

	@Test
	public void testCalculate() {
		double interest = interestCalculator.calculate(10000, 2);
		assertEquals(1000.0,interest,0.00);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIllegalCalculate() {
			interestCalculator.calculate(-10000, 2);
	}
	
	@Test
	public void testMoyenne( ) {
		
		ArrayList<Double>tab = new ArrayList<Double>();
		tab.add(6.0);
		tab.add(3.0);
		tab.add(3.0);
		double interest = interestCalculator.moyenne(tab);
		assertEquals(interest, 4.0, 0.00);
	}
}
