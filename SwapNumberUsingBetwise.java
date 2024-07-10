package com.number.problems;

/**
 * Question :
 * 1. Swap number using bitwise operator. 
 */

/**
 * @author Satish
 */

public class SwapNumberUsingBetwise {

	public static void main(String[] args) {
		int a = 8;
		int b = 10;
		a = a ^ b ^ (b = a);
		System.out.println("After swaping : a = " + a + " b = " + b);
	}
}
