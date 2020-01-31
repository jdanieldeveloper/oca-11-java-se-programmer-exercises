package com.troytech.oca11.part2;


/**
 * What is the result?
 *
 *
 * A. c = null b = false f = 0.0F
 * B. c = 0 b = false f = 0.0f
 * C. c = null b = true f = 0.0
 * D. c = b = false f = 0.0
 *
 * Answer: D
 *
 */

class FieldInit {
	char c;
	boolean b;
	float f;

	void printAll(){
		System.out.println("c = " + c);
		System.out.println("b = " + b);
		System.out.println("f = " + f);
	}
}

public class Q2 {

	public static void main(String[] args) {
		FieldInit f = new FieldInit();
		f.printAll();
		
	}

}
