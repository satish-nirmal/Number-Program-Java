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

		int a = 11;

		int b = 22;

		int temp;

		// using third variable

		temp = a;
		a = b;
		b = temp;

		// without using third variable

//		a = a + b;
//		b = a- b ;
//		a = a- b;

		System.out.println("a : " + a);
		System.out.println("b : " + b);

	}

}
