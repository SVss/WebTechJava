package com.webtech.part9.classes_tests;

import static org.junit.Assert.*;

import java.awt.Color;
import java.util.Random;

import org.junit.After;
import org.junit.Test;

import com.webtech.part9.classes.Ball;
import com.webtech.part9.classes.Basket;

public class BasketTest {

	private static final double BALL_WEIGHT_FACTOR = 100;
	private static final int BALLS_COUNT = 20;
	private static final double EPS = 0.0001;
	
	private Basket basket = new Basket();
	private Random rand = new Random();
	
	@After
	public void resetBasket() {
		basket.throwBallsAway();
	}
	
	@Test
	public void testAddBall() {
		Ball ball = new Ball(3, Color.black);
		basket.addBall(ball);
		
		Ball expectedResult = ball;
		Ball actualResult = basket.getAllBalls()[0];
		
		ball = null;
		
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testGetAllBalls() {
		Ball ball = new Ball(rand.nextDouble()*BALL_WEIGHT_FACTOR+1, Color.white);
		basket.addBall(ball);
		
		Ball[] expectedResult = new Ball[] { ball };
		Ball[] actualResult = basket.getAllBalls();
		
		assertArrayEquals(expectedResult, actualResult);
	}

	@Test
	public void testGetWeight() {
		double expectedResult = 0;
		for (int i = 0; i < BALLS_COUNT; ++i) {
			double w = rand.nextDouble()*BALL_WEIGHT_FACTOR+1;
			basket.addBall(new Ball(w, Color.red));
			expectedResult += w;
		}
		
		double actualResult = basket.getWeight();
		assertEquals(expectedResult, actualResult, EPS);
	}

}