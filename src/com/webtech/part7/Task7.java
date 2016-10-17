package com.webtech.part7;

import java.util.Scanner;

public class Task7 {
	
	public static void shellSort(double[] arr) {
		int lng = arr.length;
		double tmp = 0;
		
		int i = 0;
		while (i+1 < lng){
			if (arr[i] < arr[i+1]){
				++i;
			} else {
				tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
				
				if (i > 0){
					--i;
				}
			}
		}
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
		
		shellSort(arr);
		
		for (int i = 0; i < arr.length-1; ++i) {
			System.out.print(String.format("%f ", arr[i]));
		}
		System.out.print(String.format("%f", arr[arr.length-1]));
	}
}
