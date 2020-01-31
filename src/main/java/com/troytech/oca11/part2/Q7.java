package com.troytech.oca11.part2;


/**
 * What is the result?
 *
 *
 * A. – 6
 * B. – 4
 * C. – 5
 * D. 5
 * E. 4
 * F. Compilation fails
 *
 * Answer: C
 *
 */
public class Q1 {

	public static void main(String[] args) {
		int var1 = -5;
		int var2 = var1--;
		int var3 = 0;
		if(var2 < 0) {
			var3 = var2++;
		}else{
			var3 = --var2;
		}
		System.out.print(var3);
		
	}

}
