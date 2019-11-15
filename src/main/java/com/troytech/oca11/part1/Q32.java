package com.troytech.oca11.part1;

/**
 *
 * What value should replace kk in line x to cause jj = 5 to be output?
 *
 *
 * A. -1
 * B. 1
 * C. 5
 * D. 8
 * E. 11
 *
 *
 * Answer: E
 *
 * Explanation:  We need to get jj to 5. It is initially set to 0. So we need to go through the for loop 5 times.
 * The for loops ends when ii > 6 and ii decreases for every loop. So we need to initially set ii to 11. We set kk to 11.
 *
 * @author daniel.carvajal
 *
 */

public class Q32 {

	public static  void main(String[] args) {
		short ii;
		short jj = 0;
		//for(ii = kk; ii > 6; ii-=1){ // line x
		for(ii = 11; ii > 6; ii-=1) { // line x
			jj++;
		}
		System.out.println("jj = " + jj);
	}
}