package com.troytech.oca8.part1.q3.p3;

import com.troytech.oca8.part1.q3.p2.DoClass;
import com.troytech.oca8.part1.q3.p1.DoInterface;


/**
 * 
 * What is the result?
 * 
 * A. 100210
 * B. Compilation fails due to an error in line n1
 * C. Compilation fails due to an error at line n2
 * D. Compilation fails due to an error at line n3
 * 
 * Answer: C, Because when we try instantiate class with your 
 * protected constructor fail
 *
 */
public class Test {

	public static void main(String[] args) {
		DoInterface doi = new DoClass();
	}
}
