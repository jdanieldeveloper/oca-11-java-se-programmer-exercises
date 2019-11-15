package com.troytech.oca11.part1;

/**
 *
 * //TODO averiaguar
 *
 * @author daniel.carvajal
 *
 */

interface Z {}

class X implements Z {

	public String toString() {
		return "X ";
	}
}
public class Q24 {

	public static void main(String[] args) {
		Y myY = new Y();
		X myX = myY;
		Z myZ = myX;

		System.out.println(myX);
		System.out.println((Y) myX);
		System.out.println(myZ);
	}
}

class Y extends  X {
	public String toString() {
		return "Y ";
	}
}
