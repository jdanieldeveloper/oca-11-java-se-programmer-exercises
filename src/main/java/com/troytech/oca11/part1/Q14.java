package com.troytech.oca11.part1;

import java.util.*;

/**
 * 
 * What is the result?
 * 
 * A. class java.lang.String class java.lang.String class java.util.ArrayList
 * B. class java.lang.Object class java.lang. Object class java.util.Collection
 * C. class java.lang.StringBuilder class java.lang.String class java.util.ArrayList
 * D. class java.lang.StringBuilder class java.lang.String class java.util.List
 * 
 * Answer: C *
 */
public class Q14 {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Hello Java");
		String s2 = s1.toString();
		
		List<String> lst = new ArrayList<String>();
		lst.add(s2);
		
		System.out.println(s1.getClass());
		System.out.println(s2.getClass());
		System.out.println(lst.getClass());		
		
	}
}
