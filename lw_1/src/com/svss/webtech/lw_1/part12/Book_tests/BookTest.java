package com.svss.webtech.lw_1.part12.Book_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.svss.webtech.lw_1.part12.Book.Book;

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

}
