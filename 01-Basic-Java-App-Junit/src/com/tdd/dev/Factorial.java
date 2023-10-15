package com.tdd.dev;

public class Factorial {
	
	public int calculate(int n) {
		if (n==0) return 1;
		
		if (n > 0) return n * calculate(n-1);
		else throw new IllegalArgumentException("Negative numbers are not allowed");
	}
}
