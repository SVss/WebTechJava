package com.webtech.part1.tests;

import java.util.ArrayList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.webtech.part1.Task1;

public class Task1Test {

	private static double EPS = 0.00001;
	private final ArrayList<double[]> data = new ArrayList<double[]>();
	
	@Before
	public void prepareTestData() {
		double[] t;
		
		// data: {x, y, expectedResult}
		t = new double[] {0, 0, 0.5};
		data.add(t);
		
		t = new double[] {0.1, -5, 0.95399};
		data.add(t);
		
		t = new double[] {2, 2, 0.41776};
		data.add(t);
		
		t = new double[] {-5.9, 15, 0.1395};
		data.add(t);
		
		t = new double[] {10.06, -0.005, 0.11219};
		data.add(t);
	}	
	
	@Test
	public void testCalculate() {
		double x, y;
		double expectedResult, factResult;
		
		for (double[] ds : data) {
			x = ds[0];
			y = ds[1];
			expectedResult = ds[2];
			factResult = Task1.calculate(x, y);
			
			assertEquals(expectedResult, factResult, EPS);
		}
	}

	@After
	public void clearTestData() {
		data.clear();
	}
}
