package com.number.problems;

/**
 * Question :
 * 1. Find to Fibonacci series the given number 
 */

/**
 * @author Satish Nirmal
 */

public class Fibonacci {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c;

		for (int i = 1; i <= 10; i++) {

			c = a + b;

			a = b;
			b = c;

			System.out.println(c);
		}

	}

}
