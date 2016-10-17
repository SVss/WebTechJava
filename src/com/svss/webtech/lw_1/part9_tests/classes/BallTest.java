package com.svss.webtech.lw_1.part9_tests.classes;

import java.awt.Color;

import org.junit.Test;

import com.svss.webtech.lw_1.part9.classes.Ball;

public class BallTest {

	@Test(expected=IllegalArgumentException.class)
	public void testBallException() {
		new Ball(-7, Color.blue);
	}

}