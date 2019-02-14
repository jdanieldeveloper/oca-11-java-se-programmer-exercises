package com.troytech.oca8.part1;

/**
 * 
 * Which line causes a compilation error?
 * A. line x1
 * B. line x2
 * C. line x3
 * D. line x4
 *  
 * Answer: B 
 *
 */
public class Q16 {
	
	public static void main(String[] args) {
		doStuff();
		
		int x1 = x2;
		int x2 = j;
	}
	
	static void doStuff() {
		System.out.println(j);
	}
	
	static int j;
}
