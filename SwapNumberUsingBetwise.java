package com.number.problems;

public class SwapNumberUsingBetwise {

	public static void main(String[] args) {
		int a = 8;
		int b = 10;
		System.out.println("Before swaping : a = " + a + " b = " + b);
		a = a ^ b ^ (b = a);
		System.out.println("After swaping : a = " + a + " b = " + b);
	}
}
