package com.troytech.oca11.part2;

/**
 * What is the result?
 *
 * A. 12
 * B. Invalid Index 12
 * C. Invalid Index
 * D. Compilation fails
 *
 *
 * Answer: B
 *
 */

public class Q27 {

	public static void main(String[] args) {
		int a = -10;
		int b = 17;
		int c = ++a;
		int d = b--;
		c++;
		d--;
		System.out.print(c + ", " + d);
	}
}
