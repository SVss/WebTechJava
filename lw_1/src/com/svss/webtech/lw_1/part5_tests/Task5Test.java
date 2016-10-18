package com.svss.webtech.lw_1.part5_tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.svss.webtech.lw_1.part5.Task5;

public class Task5Test {

	@Test
	public void testGetMaxSubsequenceLengthEmpty() {
		int[] data = { };
		int expectedResult = 0;
		
		int actualResult = Task5.getMaxSubsequenceLength(data);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testGetMaxSubsequenceLength1() {
		int[] data = { 8, -3, 7, 11, 5, 0, 20, -1 };
		int expectedResult = 4;
		
		int actualResult = Task5.getMaxSubsequenceLength(data);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testGetMaxSubsequenceLength2() {
		int[] data = { 3, 8, -5, 7, 11, 0 };
		int expectedResult = 3;
		
		int actualResult = Task5.getMaxSubsequenceLength(data);
		assertEquals(expectedResult, actualResult);
	}
	
}
