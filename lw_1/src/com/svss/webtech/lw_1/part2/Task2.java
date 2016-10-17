package com.svss.webtech.lw_1.part2;

import java.util.Scanner;

public class Task2 {
	public static boolean inArea(double x, double y) {
		boolean result = true;
		
		result &= ( (x >= -4) && (x <= 4) ) && ( (y >= -3) && (y <= 5) );
		result &= ( (x >= -6) && (x <= 6) ) && ( (y >= -3) && (y <= 0) );
		
		return result;
	}
	
	public static void main(String[] args) {
		double x, y;

		System.out.println("Enter coordinates (x and y):");
		
		Scanner in = new Scanner(System.in);
		x = in.nextDouble();
		y = in.nextDouble();
		in.close();
		
		boolean result = inArea(x, y);
		System.out.println(result);
	}
}
