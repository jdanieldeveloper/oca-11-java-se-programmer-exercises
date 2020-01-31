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

public class Q48 {
	int x(double d) {
		System.out.println("one");
		return 0;
	}

	String x(double d) {
		System.out.println("two");
		return null;
	}

	double x(double d) {
		System.out.println("three"); return 0.0;
	}

	public static void main(String args[]) {
		new Q48().x(4.0);
	}

}
