package com.svss.webtech.lw_1.part12.Book_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.svss.webtech.lw_1.part12.Book.ProgrammerBook;

public class ProgrammerBookTest {

	@Test
	public void testEqualsObject() {
		ProgrammerBook b = new ProgrammerBook("Title", "Author", 4, "9999999999999", "Java", 3);
		ProgrammerBook c = new ProgrammerBook("Title", "Author", 4, "9999999999999", "Java", 3);
		
		assertEquals(b, c);
	}

	@Test
	public void testToString() {
		String expectedResult = "ProgrammerBook:"
				+ " title=\"Title\""
				+ " author=\"Author\""
				+ " price=\"4\""
				+ " edition=\"0\""
				+ " isbn=\"9999999999999\""
				+ " language=\"Java\""
				+ " level=\"3\"";
		String actualResult = (new ProgrammerBook("Title", "Author", 4,  "9999999999999", "Java", 3)).toString();
		
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testClone() throws CloneNotSupportedException {
		ProgrammerBook b = new ProgrammerBook("Title", "Author", 4, "9999999999999", "Java", 3);
		ProgrammerBook c = (ProgrammerBook) b.clone();
		
		assertEquals(b, c);
	}

}
