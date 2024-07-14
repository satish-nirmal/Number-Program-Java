package com.number.problems;

/**
 * Question :
 * 1. Swap number using third variable. 
 */

/**
 * @author Satish
 */

public class SwapNumber {
	
	public static void main(String[] args) {

		int a = 110;

		int b = 180;

		int temp;

		// using third variable

		temp = a;
		a = b;
		b = temp;

		System.out.println("a : " + a);
		System.out.println("b : " + b);

	}

}
