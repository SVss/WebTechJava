package com.webtech.part8_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.webtech.part8.Task8;

public class Task8Test {

	@Test
	public void testGetInsertPlacesRegular1() {
		double[][] data = new double[][] {
				new double[] {0, 10, 12, 13, 15, 20},
				new double[] {-3, 7, 12.5, 25, 50}
		};
		int[] expectedResult = new int[] { 0, 1, 3, 6, 6};
		
		int[] actualResult = Task8.getInsertPlaces(data[0], data[1]);
		
		assertArrayEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testGetInsertPlacesRegular2() {
		double[][] data = new double[][] {
				new double[] {0, 10, 20},
				new double[] {-5, 0, 14, 15}
		};
		int[] expectedResult = new int[] { 0, 0, 2, 2 };
		
		int[] actualResult = Task8.getInsertPlaces(data[0], data[1]);
		
		assertArrayEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testGetInsertPlacesEmptySource() {
		double[][] data = new double[][] {
				new double[] {0, 10, 12, 13, 15, 20},
				new double[] { }
		};
		int[] expectedResult = new int[] { };
		
		int[] actualResult = Task8.getInsertPlaces(data[0], data[1]);
		
		assertArrayEquals(expectedResult, actualResult);
	}

	@Test
	public void testGetInsertPlacesEmptyTarget() {
		double[][] data = new double[][] {
				new double[] { },
				new double[] { 0, 10, 12, 13, 15, 20 }
		};
		int[] expectedResult = new int[] { 0, 0, 0, 0, 0, 0 };
		
		int[] actualResult = Task8.getInsertPlaces(data[0], data[1]);
		
		assertArrayEquals(expectedResult, actualResult);
	}
}
