package com.webtech.part3_tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.webtech.part3.Task3;

public class Task3Test {

	private static final double EPS = 0.00001;
	
	@Test
	public void testGetValues() {
		double a = 0, b = 3, h = 0.5;
		
		ArrayList<double[]> expectedResult = new ArrayList<double[]>();
		double[] t;
		
		t = new double[] {0, 0};
		expectedResult.add(t);
		
		t = new double[] {0.5, 0.5463};
		expectedResult.add(t);
		
		t = new double[] {1, 1.55741};
		expectedResult.add(t);
		
		t = new double[] {1.5, 14.10142};
		expectedResult.add(t);
		
		t = new double[] {2, -2.18504};
		expectedResult.add(t);
		
		t = new double[] {2.5, -0.74702};
		expectedResult.add(t);
		
		t = new double[] {3, -0.14255};
		expectedResult.add(t);
		
		ArrayList<double[]> factResult = Task3.getFuncResults(a, b, h);
		
		assertEquals(expectedResult.size(), factResult.size() );
		
		for (int i = 0; i < factResult.size(); ++i) {
			assertArrayEquals(expectedResult.get(i), factResult.get(i), EPS);
		}
	}

}
