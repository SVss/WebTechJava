package com.svss.webtech.lw_1.part6;

import java.util.Scanner;

public class Task6 {
	public static double[][] getMatrix(double[] arr){
		int lng = arr.length;
		
		double[][] result = new double[lng][];
		for (int i = 0; i < lng; ++i){
			result[i] = new double[lng];
		}
		
		for (int i = 0; i < lng; ++i){
			for (int j = 0; j < lng; ++j){
				result[i][j] = arr[(i+j) % lng];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int n = in.nextInt();
		
		double[] arr = new double[n];
		
		System.out.print("Enter array elements:");
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = in.nextDouble();
		}
		
		in.close();
		
		double[][] result = getMatrix(arr);
		
		for (int i = 0; i < result.length; ++i) {
			for (int j = 0; j < result[i].length; ++j) {
				System.out.print(String.format("%f ", result[i][j]));
			}
			System.out.println();
		}
	}
}
