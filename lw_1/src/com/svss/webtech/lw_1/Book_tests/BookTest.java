package com.svss.webtech.lw_1.Book_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.svss.webtech.lw_1.Book.Book;

public class BookTest {

	@Test
	public void testEqualsObject() {
		Book b = new Book("Title", "Author", 4);
		Book c = new Book("Title", "Author", 4);
		
		assertEquals(b, c);
	}

	@Test
	public void testToString() {
		String expectedResult = "Book:"
				+ " title=\"Title\""
				+ " author=\"Author\""
				+ " price=\"4\""
				+ " edition=\"0\"";
		String actualResult = (new Book("Title", "Author", 4)).toString();
		
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testClone() throws CloneNotSupportedException {
		Book b = new Book("Title", "Author", 4);
		Book c = (Book)b.clone();
		
		assertEquals(b, c);
	}

}
