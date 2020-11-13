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

class SpecialException extends Exception {
	public SpecialException(String message) {
		super(message);
		System.out.println(message);
	}
}

public class Q39 {

	public static void main(String[] args){
		try {
			doSomething();
		} catch (SpecialException e){
			System.out.println(e);
		}
	}


	static void doSomething() throws SpecialException {
		int[] ages = new int[4];
		ages[4] = 17;
		doSomethingElse();
	}

	static void doSomethingElse() throws SpecialException {
		throw new SpecialException("Thown at end of doSemething method");
	}
}
