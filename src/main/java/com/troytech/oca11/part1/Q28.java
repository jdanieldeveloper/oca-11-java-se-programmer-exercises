package com.troytech.oca11.part1;

/**
 *
 * Given the code fragment:
 *
 * A. 4 Null
 * B. Null 4
 * C. An IllegalArgumentException is thrown at run time
 * D. 4An ArrayIndexOutOfBoundException is thrown at run time
 *
 * Answer: D
 *
 * Explanation:  The first println statement, System.out.println(array [4][1]);,
 * works fine. It selects the element/array with index 4, {0, 4, 8, 12, 16},
 * and from this array it selects the element with index 1, 4. Output: 4 The second println statement,
 * System.out.println(array) [1][4]);, fails. It selects the array/element with index 1, {0, 1}, and from this array it try to select the element with index 4.
 * This causes an exception. Output: 4
 *
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
 *
 * @author daniel.carvajal
 *
 */

public class Q28 {

	public static void main(String[] args) {
		int[][] array = {{0}, {0, 1}, {0, 2, 4}, {0, 3, 6 ,9}, {0, 4, 8, 12, 16}};
		System.out.println(array[4][1]);
		System.out.println(array[1][4]);
	}
}