package com.webtech.part4_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.webtech.part4.Task4;

public class Task4TestIsPrime {
	
	@Test
	public void testIsPrime2() {
		assertEquals(true, Task4.isPrime(2));
	}

	@Test
	public void testIsPrime20() {
		assertEquals(false, Task4.isPrime(20));
	}
	
	@Test
	public void testIsPrime21() {		
		assertEquals(false, Task4.isPrime(21));
	}
	
	@Test
	public void testIsPrime503() {
		assertEquals(true, Task4.isPrime(503) );
	}
	
}
