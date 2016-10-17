package com.webtech.part2_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.webtech.part2.Task2;

public class Task2Test {

	@Test
	public void testInArea1() {
		double x = 0, y = 0;
		boolean expectedResult = true;
		
		assertEquals(expectedResult, Task2.inArea(x, y) );
	}

	@Test
	public void testInArea2() {
		double x = 1, y = 10;
		boolean expectedResult = false;
		
		assertEquals(expectedResult, Task2.inArea(x, y) );
	}
	
	@Test
	public void testInArea3() {
		double x = -8, y = 3;
		boolean expectedResult = false;
		
		assertEquals(expectedResult, Task2.inArea(x, y) );
	}
	
	@Test
	public void testInArea4() {
		double x = -2, y = -2;
		boolean expectedResult = true;
		
		assertEquals(expectedResult, Task2.inArea(x, y) );
	}
	
	@Test
	public void testInArea5() {
		double x = 4, y = 5;
		boolean expectedResult = false;
		
		assertEquals(expectedResult, Task2.inArea(x, y) );
	}
}
