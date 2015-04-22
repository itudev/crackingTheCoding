package com.usingMsbMax;


//Maximum no. of two. 
// Without using if-else and comparision operator.
public class MaxNumberMsb {

	public static int maxNumUsingMsb(int a, int b){
		int c= a - b;
		int k = (c >>> 31);// will give MSB. I used the unsigned operator because I just want the absolute value.
		int max = a - k * c; // k could be either 0 or 1. If 0, means the first argument would be greater and vice versa.
		System.out.println("Maximum no is: " + max);
		return max;
		
	}
	
	public static void main(String[] args) {
		MaxNumberMsb.maxNumUsingMsb(-15, -7);
		
	}

}
