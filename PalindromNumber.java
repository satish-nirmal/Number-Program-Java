package com.number.problems;

/**
 * Question :
 * 1. Find to Given number are palindrom or not. 
 */

/**
 * @author Satish
 */


public class PalindromNumber {

	public static void main(String[] args) {

		int num = 121;

		int rem, rev = 0;
		int temp = num;

		while (temp != 0) {

			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}

		if (num == rev) {
			System.out.println("This is Palindrom Number");
		} else {
			System.out.println("Not Palindrom Number");

		}
	}

}
