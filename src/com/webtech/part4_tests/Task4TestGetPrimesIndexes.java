package com.webtech.part4_tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.webtech.part4.Task4;

public class Task4TestGetPrimesIndexes {

	@Test
	public void testGetPrimesIndexes1() {
		long[] data = new long[] { 1, 20, 15, 7, 99, 991, 35, 107 };
		
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(3);
		expectedResult.add(5);
		expectedResult.add(7);
		
		ArrayList<Integer> factResult = Task4.getPrimesIndexes(data);
		assertEquals(expectedResult.size(), factResult.size() );
		
		for(int i = 0; i < expectedResult.size(); ++i) {
			assertEquals(expectedResult.get(i).intValue(), factResult.get(i).intValue() );
		}
	}
	
	@Test
	public void testGetPrimesIndexes2() {
		long[] data = new long[] { 537, 23, 211, 150, 375, 2, 801, 535, 17, 7 };
		
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(1);
		expectedResult.add(2);
		expectedResult.add(5);
		expectedResult.add(8);
		expectedResult.add(9);
		
		ArrayList<Integer> factResult = Task4.getPrimesIndexes(data);
		assertEquals(expectedResult.size(), factResult.size() );
		
		for(int i = 0; i < expectedResult.size(); ++i) {
			assertEquals(expectedResult.get(i).intValue(), factResult.get(i).intValue() );
		}
	}
	
}
