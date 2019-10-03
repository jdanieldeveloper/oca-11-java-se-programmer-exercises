package com.troytech.oca11.part1;

abstract class A1 {

	public abstract void m1();

	public void m2() {
		System.out.println("Green");
	}
}

abstract class A2 extends A1 {

	public abstract void m1();

	public void m2() {
		System.out.println("Blue");
	}
}

/**
 * 
 * What is the result?
 * A. Yellow Pink Red
 * B. Cyan Blue Red
 * C. Cyan Green Red
 * D. Compilation Fails
 *
 * Answer: In this case fail to compile, because tp.m3() no exists in 
 * A2 reference class 
 *
 *
 */

// public class A3 extends A2 {
public class Q5 extends A2 {

	public void m1() {
		System.out.println("Cyan");
	}

	public void m2() {
		System.out.println("Pink");
	}

	public void m3() {
		System.out.println("Red");
	}
	
	public static void main(String[] args) {
		A2 tp = new Q5();
		
		tp.m1();
		tp.m2();
		tp.m3();
	}

}
