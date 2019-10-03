package com.troytech.oca11.part1;

/**
 * Which statement, when inserted into line 5, is valid change?
 * 
 * A. asc = sc;
 * B. sc = asc;
 * C. asc = (object) sc;
 * D. asc = sc.clone()
 *
 * Answer: B
 * 
 */
public class Q10 {
	
	public static void main(String[] args) {
		AnotherSampleClass asc = new AnotherSampleClass();
		SampleClass sc = new SampleClass();
		//answer
		sc = asc;
	}
}

class AnotherSampleClass extends SampleClass{	
}

class SampleClass{	
}
