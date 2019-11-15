package com.troytech.oca11.part1;

/**
 *
 * What is the result?
 *
 * A. 120
 * B. 120D
 * C. A NumberFormatException will be thrown.
 * D. Compilation fails due to error at line 5. E. Compilation tails due to error at line 8.
 *
 *
 * Answer: E
 *
 * Explanation:  At line 5, we have created a wrapper object of double by passing 120D, which is convertible to a Double,
 * so there won't be any exception there. But if you check carefully, you can see the variable number is declared inside try block,
 * so the scope of the variable number is limited to that block, so trying to access it outside causes a compile time error.
 * httpsy/docs.oracle.com/javase/tutorial/iava/nutsandbolts/variables.html
 *
 * @author daniel.carvajal
 *
 */

public class Q25 {

	public static void main(String[] args) {
		try {
			Double number = Double.valueOf("120D");
		} catch (NumberFormatException e){
		}
		System.out.println(number);
	}
}