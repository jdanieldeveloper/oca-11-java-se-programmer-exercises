package com.troytech.oca8.part1;

public class Q1 {
	
	/**
	 * Which three code fragments, when replaced individually for foo, enables the program to compile?
	 * 
	 * A. int i : array
	 * B. int i = 0; i < 1;
	 * C. ; ;
	 * D. ; i < 1; i++
	 * E. i = 0; i<1;
	 * 
	 */
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		
		//It's Ok
		for(int i : array) {
			System.out.print("-> " + i);
		}
		
		//It's Ok
		for(int i = 0; i < 1; ) {
			System.out.print("-> " + i);
		}
		
		//The correct answer is A, B, C
		
		
	}

}
