package com.troytech.oca11.part1.q3.p3;

import com.troytech.oca11.part1.q3.p2.DoClass;
import com.troytech.oca11.part1.q3.p1.DoInterface;


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
public class Q3 {

	public static void main(String[] args) {
		DoInterface doi = new DoClass();
	}
}
