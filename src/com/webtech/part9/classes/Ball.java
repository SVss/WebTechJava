package com.webtech.part9.classes;

import java.awt.Color;

public class Ball {
	private Color color;
	private double weight;
	
	public Ball(double weight, Color color) throws IllegalArgumentException{
		if (weight <= 0) {
			throw new IllegalArgumentException("Weight can't be less than 0");
		}
		
		this.weight = weight;
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}
}