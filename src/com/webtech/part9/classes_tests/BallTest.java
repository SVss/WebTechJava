package com.webtech.part9.classes_tests;

import java.awt.Color;

import org.junit.Test;

import com.webtech.part9.classes.Ball;

public class BallTest {

	@Test(expected=IllegalArgumentException.class)
	public void testBallException() {
		new Ball(-7, Color.blue);
	}

}