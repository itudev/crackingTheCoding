package com.fibRecursion;

import java.util.ArrayList;

public class FibbonacciRecursion {
	static int count = 0;
	static int c = 0;
	static int[] arr = new int[4];
	static ArrayList<Integer> al = new ArrayList<Integer>();

	// iterative fibbonacci nth number
	public static void fibb(int n) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(1);
		int sum = 0;
		if (n > 2) {
			int i = 2;
			while (i <= n) {
				sum = al.get(i - 2) + al.get(i - 1);
				al.add(sum);
				i++;
			}
			for(int j =0; j<=n; j++){
				System.out.println(al.get(j));
				
			}

		}

	}
	// recursively finding the nth fibbonacci number
	public static int fibbRecursion(int n) {
		if(n<2){
			return n;
		}
		 int sum = fibbRecursion(n -1) + fibbRecursion(n - 2);
		 return sum;
		}


	public static void main(String[] args) {
		FibbonacciRecursion.fibb(4);
		FibbonacciRecursion.fibbRecursion(4);

	}

}
