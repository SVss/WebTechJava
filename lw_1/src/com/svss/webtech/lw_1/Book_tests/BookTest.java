package com.svss.webtech.lw_1.Book_tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

import com.svss.webtech.lw_1.Book.Book;

public class BookTest {
	
	@Test
	public void testEqualsObject() {
		Book b = new Book("Title", "Author", 4, "9999999999999");
		Book c = new Book("Title", "Author", 4, "9999999999999");
		
		assertEquals(b, c);
	}

	@Test
	public void testToString() {
		String expectedResult = "Book:"
				+ " title=\"Title\""
				+ " author=\"Author\""
				+ " price=\"4\""
				+ " edition=\"0\""
				+ " isbn=\"9999999999999\"";
		String actualResult = (new Book("Title", "Author", 4, "9999999999999")).toString();
		
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testClone() throws CloneNotSupportedException {
		Book b = new Book("Title", "Author", 4, "9999999999999");
		Book c = (Book)b.clone();
		
		assertEquals(b, c);
	}

	@Test
	public void testCompareTo() {
		Book[] expectedResult = new Book[] {
				new Book("t1", "a1", 1, "1"),
				new Book("t2", "a2", 2, "2"),
				new Book("t3", "a3", 3, "3"),
				new Book("t4", "a4", 4, "4"),
				new Book("t5", "a5", 5, "5"),
				new Book("t6", "a6", 6, "6")
		};
		
		Book[] actualResult = 
				Arrays.copyOf(expectedResult, expectedResult.length);
		
		shuffleArray(actualResult);
		Arrays.sort(actualResult);
		
		assertArrayEquals(expectedResult, actualResult);
	}

	/**
	 * Simple random array shuffle
	 * 
	 * @param arr Array to shuffle
	 */
	public static void shuffleArray(Object[] arr) {
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; ++i) {
			int index = rand.nextInt(i+1);
			
			Object tmp = arr[i];
			arr[i] = arr[index];
			arr[index] = tmp;
		}
	}
	
}
