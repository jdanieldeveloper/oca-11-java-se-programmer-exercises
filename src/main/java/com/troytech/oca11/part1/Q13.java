package com.troytech.oca11.part1;

/**
 * 
 * Which code fragment, when inserted at line 9, enables the code to print true?
 * 
 * A. String str2 = str1;
 * B. String str2 = new string (str1);
 * C. String str2 = sb1.toString();
 * D. String str2 = �Duke�;
 * 
 * Answer: A
 */
public class Q13 {
	
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		String str1 = sb1.toString();
		
		String str2 = str1;
		
		System.out.println(str1 == str2);
		
	}
}
