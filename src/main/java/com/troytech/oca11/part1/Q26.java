package com.troytech.oca11.part1;

/**
 *
 * Which set of changes enable the code to print 1, true?
 *
 * A. Replacing <code1> with index > 0 and replacing <code2> with index--;
 * B. Replacing <code1> with index > 0 and replacing <code2> with --index;
 * C. Replacing <code1> with index > 5 and replacing <code2> with --index ;
 * D. Replacing <code1> with index and replacing <code2> with --index ;
 *
 * Answer: A
 *
 * Explanation:  Note: Code in B (code2 is --index;). also works fine.
 *
 * @author daniel.carvajal
 *
 */

public class Q26 {

	public static void main(String[] args) {
		boolean isChecked = false;
		int arry[] = {1,3,5,7,8,9};
		int index = arry.length;
		while(index > 0){
			if(arry[index -1] % 2 == 0){
				isChecked = true;
			}
			index++;
		}
		System.out.println(arry[index] + ", " + isChecked);
	}
}