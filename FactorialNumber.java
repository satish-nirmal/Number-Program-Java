package com.number.problems;

/**
 * Question :
 * 1. Find The Factorial of the given number in the program

/**
 * @author Satish
 */
public class FactorialNumber {

		public static void main(String[] args) {
			
			int num = 10 ;
			
			int fact = 1 ;
			
			
			for(int i= 1; i<= num ; i++) {
				
				fact = fact * i;
			}
			
			System.out.println(fact);
			
		}
}
