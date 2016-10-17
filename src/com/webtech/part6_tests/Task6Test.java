package com.webtech.part6_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.webtech.part6.Task6;

public class Task6Test {

	private static final double EPS = 0.0001; 
	
	@Test
	public void testGetMatrix1() {
		double[] data = { 1, 2, 3 };
		double[][] expectedResult =
			{
				{ 1, 2, 3 },
				{ 2, 3, 1 },
				{ 3, 1, 2 }
			};
		
		double[][] result = Task6.getMatrix(data);
		for (int i = 0; i < data.length; ++i) {
			assertArrayEquals(expectedResult[i], result[i], EPS);
		}
	}

	@Test
	public void testGetMatrix2() {
		double[] data = { 0.7, 22, -3.5, 0 };
		double[][] expectedResult =
			{
				{ 0.7, 22, -3.5, 0 },
				{ 22, -3.5, 0, 0.7 },
				{ -3.5, 0, 0.7, 22 },
				{ 0, 0.7, 22, -3.5 }
			};
		
		double[][] result = Task6.getMatrix(data);
		for (int i = 0; i < data.length; ++i) {
			assertArrayEquals(expectedResult[i], result[i], EPS);
		}
	}
	
}
