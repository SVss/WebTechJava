package com.svss.webtech.lw_1.part5;

import java.util.Scanner;

public class Task5 {
	/**
	 * @param arr - integer array to find in
	 * @return length of maximum increasing subsequence
	 */
	public static int getMaxSubsequenceLength(int[] arr) {
		int lng = arr.length;
		
		if (lng == 0) {
			return 0;
		}
		
		int[] subseqLng = new int[lng];
		
		for (int i = 1; i < lng; ++i) {
			for (int j = 0; j < i; ++j) {
				if (arr[j] < arr[i]) {
					subseqLng[i] = Math.max(subseqLng[i], subseqLng[j]+1);
				}
			}
		}
		
		int result = subseqLng[0];
		for (int i = 1; i < lng; ++i) {
			result = Math.max(result, subseqLng[i]);
		}
		return result + 1;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int n = in.nextInt();
		
		System.out.println("Enter array elements:");
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
		}
		in.close();
		
		int result = arr.length - getMaxSubsequenceLength(arr);
		System.out.println(String.format("Minimum elements count to remove: %d", result));
	}
}
