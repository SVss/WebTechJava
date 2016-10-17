package com.webtech.part9;

import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

import com.webtech.part9.classes.Ball;
import com.webtech.part9.classes.Basket;

public class Task9 {
	
	private static final double BALL_WEIGHT_FACTOR = 100;
	
	private static Random rand = new Random();
	
	private static Color getRandomColor() {
		return new Color(
				rand.nextFloat(),
				rand.nextFloat(),
				rand.nextFloat());
	}
	
	private static double getRandomWeight() {
		return rand.nextDouble()*BALL_WEIGHT_FACTOR+1;
	}

	/**
	 * Add random balls to basket.
	 * Get total basket weight and count blue balls.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of balls:");
		int count = in.nextInt();
		
		in.close();
		
		Basket basket = new Basket();
		Color color;
		for (int i = 0; i < count; ++i) {
			if (rand.nextBoolean()){
				color = Color.blue;
			} else {
				color = getRandomColor();
			}
			basket.addBall(new Ball(getRandomWeight(), color));
		}
		
		double totalWeight = basket.getWeight();
		System.out.println(String.format("Total balls weight: %f", totalWeight));
		
		int blueBallsCount = basket.countBallsWithColor(Color.blue);
		System.out.println(String.format("Blue balls count: %d / %d", blueBallsCount, count));
	}
}