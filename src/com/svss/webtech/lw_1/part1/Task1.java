package com.svss.webtech.lw_1.part1;

public class Task1 {
	public static double calculate(double x, double y) {
		double numerator = 1 + Math.pow(Math.sin(x + y), 2);
		
		double fraction = 2*x / (1+x*x*y*y);
		double denominator = 2 + Math.abs(x - fraction);
		
		return numerator / denominator;
	}
}
