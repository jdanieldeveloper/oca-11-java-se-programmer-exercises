package com.troytech.oca11.part2;


/**
 * A. line 3
 * B. line 4
 * C. line 5
 * D. line 6
 * E. line 10
 * F. line 11
 * G. line 12
 * H. line 13
 *
 * Answer: C, D, H
 *
 *
 * Answer: C
 *
 */

class StaticMethods {
	static void one() {
		two();
		StaticMethods.two();
		three();
		StaticMethods.four();
	}

	static void two() {}

	void three(){
		one();
		StaticMethods.two();
		three();
		StaticMethods.four();
	}

	void four() { }
}

public class Q4 {

	public static void main(String[] args) {
		Y myY = new Y();
		X myX = myY;
		Z myZ = myX;
		System.out.print(myZ);
	}
}