package com.troytech.oca11.part1;

/**
 * 
 * A. One
* B. Two
* C. Three
* D. Compilation fails
* 
* Answer: C
* Explanation:
* In this scenario the overloading method is called with a double/float value, 4.0. This makes
* the third overload method to run.
* Note:
* The Java programming language supports overloading methods, and Java can distinguish
* between methods with different method signatures. This means that methods within a class
* can have the same name if they have different parameter lists. Overloaded methods are
* differentiated by the number and the type of the arguments passed into the method.
 * 
 * @author daniel.carvajal
 *
 */
public class Q22 {
	
	void x(int i) {
		System.out.println("One");
	}
	
	void x(String s) {
		System.out.println("Two");
	}
	
	void x(double d) {
		System.out.println("Three");
	}
	
	public static void main(String[] args) {
		new Q22().x(4.0);
	}
}
