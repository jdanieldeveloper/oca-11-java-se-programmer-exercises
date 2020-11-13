package com.troytech.oca11.part2;


/**
 * What is the reference type of myZ and what is the type of the object it references?
 *
 *
 * A. Reference type is Z; object type is Z.
 * B. Reference type is Y; object type is Y.
 * C. Reference type is Z; object type is Y.
 * D. Reference type is X; object type is Z.
 *
 *
 * Answer: C
 *
 */

class X implements Z {
	public String toString() {
		return "I am X";
	}
}

public class Q3 {

	public static void main(String[] args) {
		Y myY = new Y();
		X myX = myY;
		Z myZ = myX;
		System.out.print(myZ);
	}
}

class Y extends X {
	public String toString() {
		return "I am Y";
	}
}

interface  Z {}
