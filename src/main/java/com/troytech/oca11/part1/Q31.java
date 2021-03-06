package com.troytech.oca11.part1;

/**
 *
 * Which is true?
 *
 *
 * A. Sum for 0 to 0 = 55
 * B. Sum for 0 to 10 = 55
 * C. Compilation fails due to error on line 6.
 * D. Compilation fails due to error on line 7.
 * E. An Exception is thrown at the runtime.
 *
 * Answer: B
 *
 * Explanation:  Loop variables scope limited to that enclosing loop. So in this case, the scope of the loop variable x declared at line 5,
 * limited to that for loop. Trying to access that variable at line 7, which is out of scope of the variable x, causes a compile time error.
 * So compilation fails due to error at line 7. Hence option D is correct. Options A and B are incorrect, since code fails to compile.
 * Reference: httpsy/docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
 *
 * @author daniel.carvajal
 *
 */

public class Q31 {

	public static  void main(String[] args) {
		int sum = 0;

		for(int x = 0; x < 10; x++)
			sum+=x;
		System.out.println("Sum for 0 to " + x);
		System.out.println(" = " + sum);
	}
}