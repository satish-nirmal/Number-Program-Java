package com.number.problems;

/**
 * Question :
 * 1. Find to Reverse the given number 
 */

/**
 * @author Satish
 */

public class ReverseNumber {
	
	public static void main(String[] args) {

		int num = 12345;
		
		

		int rem, rev = 0;

		while (num != 0) {

			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		System.out.println(rev);

	}

}
