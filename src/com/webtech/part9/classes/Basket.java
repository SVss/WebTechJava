package com.webtech.part9.classes;

import java.awt.Color;
import java.util.ArrayList;

public class Basket {
	private ArrayList<Ball> ballsArrayList = new ArrayList<Ball>();
	
	public void addBall(Ball ball) {
		ballsArrayList.add(ball);
	}
	
	public Ball[] getAllBalls() {
		return (Ball[]) ballsArrayList.toArray(new Ball[ballsArrayList.size()]);
	}
	
	public double getWeight() {
		double result = 0;
		for (Ball ball : ballsArrayList) {
			result += ball.getWeight();
		}
		return result;
	}
	
	public void throwBallsAway() {
		ballsArrayList.clear();
	}
	
	public int countBallsWithColor(Color color) {
		int result = 0;
		for (Ball ball : ballsArrayList) {
			if (ball.getColor() == color) {
				++result;
			}
		}
		return result;
	}
}