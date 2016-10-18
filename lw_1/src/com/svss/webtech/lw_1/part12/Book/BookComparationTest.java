package com.svss.webtech.lw_1.part12.Book;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class BookComparationTest {

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

	@Test
	public void testNameComparator() {
		Book[] expectedResult = new Book[] {
				new Book("a", "aq", 1, "9"),
				new Book("b", "ar", 2, "8"),
				new Book("c", "av", 3, "7"),
				new Book("d", "at", 4, "6"),
				new Book("e", "as", 5, "5"),
				new Book("f", "ap", 6, "4")
		};
		
		Book[] actualResult = 
				Arrays.copyOf(expectedResult, expectedResult.length);
		
		shuffleArray(actualResult);
		Arrays.sort(actualResult, new Book.NameComparator());
		
		assertArrayEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testNameAuthorComparator() {
		Book[] expectedResult = new Book[] {
				new Book("a", "aq", 1, "9"),
				new Book("b", "a", 2, "8"),
				new Book("c", "1", 3, "7"),
				new Book("c", "2", 4, "6"),
				new Book("c", "3", 5, "5"),
				new Book("f", "ap", 6, "4")
		};
		
		Book[] actualResult = 
				Arrays.copyOf(expectedResult, expectedResult.length);
		
		shuffleArray(actualResult);
		Arrays.sort(actualResult, new Book.NameAuthorComparator());
		
		assertArrayEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testAuthorNameComparator() {
		Book[] expectedResult = new Book[] {
				new Book("a", "A", 1, "9"),
				new Book("b", "B", 2, "8"),
				new Book("c", "C", 3, "7"),
				new Book("0", "D", 4, "6"),
				new Book("1", "D", 5, "5"),
				new Book("f", "F", 6, "4")
		};
		
		Book[] actualResult = 
				Arrays.copyOf(expectedResult, expectedResult.length);
		
		shuffleArray(actualResult);
		Arrays.sort(actualResult, new Book.AuthorNameComparator());
		
		assertArrayEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testAuthorNamePriceComparator() {
		Book[] expectedResult = new Book[] {
				new Book("a", "A", 1, "9"),
				new Book("b", "B", 2, "8"),
				new Book("c", "C", 3, "7"),
				new Book("0", "D", 10, "6"),
				new Book("0", "D", 100, "5"),
				new Book("1", "D", 6, "4")
		};
		
		Book[] actualResult = 
				Arrays.copyOf(expectedResult, expectedResult.length);
		
		shuffleArray(actualResult);
		Arrays.sort(actualResult, new Book.AuthorNamePriceComparator());
		
		assertArrayEquals(expectedResult, actualResult);
	}
	
	/**
	 * Simple array shuffle
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
