package com.svss.webtech.lw_1.part7_tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

import com.svss.webtech.lw_1.part7.Task7;

public class Task7Test {

	public static final double EPS = 0.0001;
	public static final int RANDOM_TEST_REPEAT_TIMES = 100;
	
	private static Random randomizer = new Random();
	
	private static double[] getRandomDoubleArray() {
		double[] data = new double[randomizer.nextInt(100)];
		for (int i = 0; i < data.length; ++i) {
			data[i] = randomizer.nextDouble();
		}
		return data;
	}
	
	@Test
	public void testShellSortRepeatedRandomTimes() {
		double[] data;
		double[] expectedResult;
		
		for (int i = 0; i < RANDOM_TEST_REPEAT_TIMES; ++i) {
			data = getRandomDoubleArray();
			expectedResult = data.clone();
			
			Arrays.sort(expectedResult);
			Task7.shellSort(data);
			
			assertArrayEquals(expectedResult, data, EPS);
		}
	}
	
	@Test
	public void testShellSortEmpty() {
		double[] data = new double[] { };
		double[] expectedResult = new double[]{ };
		
		Task7.shellSort(data);
		
		assertArrayEquals(expectedResult, data, EPS);
	}
	
	@Test
	public void testShellSortSingle() {
		double[] data = new double[] { randomizer.nextDouble() };
		double[] expectedResult = data.clone();
		
		Task7.shellSort(data);
		
		assertArrayEquals(expectedResult, data, EPS);
	}

}
