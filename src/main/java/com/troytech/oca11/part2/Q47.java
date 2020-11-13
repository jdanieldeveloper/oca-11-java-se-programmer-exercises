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

public class Q47 {

	public static void main(String args[]) {
		String str1 = "Java";
		char str2[] = {'J', 'a', 'v', 'a'};
		String str3 = null;
		for(char c : str2) {
			str3 = str3 + c;
		}
		if(str1.equals(str3))
			System.out.print("Sucessful");
		else
			System.out.print("Unsucessful");
	}

}
