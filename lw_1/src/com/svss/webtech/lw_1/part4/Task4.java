package com.svss.webtech.lw_1.part4;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {

	public static boolean isPrime(long n) {
		if (n == 1) {
			return false;
		}
		
		if (n == 2) {
			return true;
		}
		
		boolean result = (n % 2 != 0);
		
		long x = 1;
		long max = Math.round(Math.sqrt(n));
		while( (result) && (x <= max) ) {
			x += 2;
			result = (n % x != 0);
		}
		
		return result;
	}
	
	public static ArrayList<Integer> getPrimesIndexes(long[] arr) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; ++i) {
			if (isPrime(arr[i])) {
				result.add(i);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int N;
		long[] A;
		
		System.out.print("Enter array size:");
		
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		if (N < 0) {
			System.out.println("Invalid array size: N must be >0");
			in.close();
			return;
		}
		
		A = new long[N];
		
		for (int i = 0; i < N; ++i) {
			A[i] = in.nextInt();
		}
		in.close();
		
		ArrayList<Integer> indexes = getPrimesIndexes(A);
		for (int i = 0; i < indexes.size(); ++i) {
			System.out.format("%d ", indexes.get(i).intValue());			
		}
		
	}

}
