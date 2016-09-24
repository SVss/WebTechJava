package com.webtech.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {

	private  static final double EPS = 0.00001;
	
	public static double Func(double x) {
		return Math.tan(x);
	}
	
	public static ArrayList<double[]> getFuncResults(double a, double b, double h) {
		ArrayList<double[]> result = new ArrayList<double[]>();
		double[] t;
		
		double x = a;
		while ( ( (b - x) >= EPS) || ( (b - x) == 0) ) {
			t = new double[] {x, Func(x)};
			result.add(t);
			x += h;
		}
		return result;
	}
	
	public static void main(String[] args) {
		double a, b, h;
		
		System.out.println("Enter segment [a, b] and step - h:");
		
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		b = in.nextDouble();
		h = in.nextDouble();
		in.close();
		
		ArrayList<double[]> result = getFuncResults(a, b, h);
		if (!result.isEmpty()) {
			System.out.println("    x\ttg(x)");
			System.out.println("------------------");
			for (double[] ds : result) {
				System.out.format("%5.3f\t%5.3f\n", ds[0], ds[1]);
			}
		}
	}

}
