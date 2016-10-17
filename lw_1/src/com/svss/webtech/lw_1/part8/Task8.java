package com.svss.webtech.lw_1.part8;

import java.util.Scanner;

public class Task8 {

	/**
	 *  Get positions to insert elements from source to target.
	 *  Assume each insertion is separate (target indexes are immutable)
	 */
	public static int[] getInsertPlaces(double[] target, double[] source) {
		int[] result = new int[source.length];
		
		int targetPos = 0;
		int sourcePos = 0;
		while ((targetPos < target.length)
				&& (sourcePos < source.length)) {
			if (!(source[sourcePos] > target[targetPos])) {
				result[sourcePos] = targetPos;
				++sourcePos;
			} else {
				++targetPos;
			}
		}
		
		while (sourcePos < source.length) {	// insert the rest
			result[sourcePos] = targetPos;
			++sourcePos;
		}

		return result;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter target array (a) size: ");
		int targetSize = in.nextInt();
		
		double[] a = new double[targetSize];
		
		System.out.print("Enter target array (a) elements:");
		for (int i = 0; i < targetSize; ++i) {
			a[i] = in.nextDouble();
		}
		
		System.out.print("Enter source array (b) size: ");
		int sourceSize = in.nextInt();
		
		double[] b = new double[sourceSize];
		
		System.out.print("Enter source array (b) elements:");
		for (int i = 0; i < sourceSize; ++i) {
			b[i] = in.nextDouble();
		}
		
		in.close();
		
		int[] result = getInsertPlaces(a, b);
		
		for (int i = 0; i < result.length-1; ++i) {
			System.out.print(String.format("%d ", result[i]));
		}
		System.out.print(String.format("%d", result[result.length-1]));
	}
}
