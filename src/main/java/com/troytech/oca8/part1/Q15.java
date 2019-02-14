package com.troytech.oca8.part1;


/**
 * 
 * How many objects have been created when the line / / do complex stuff is reached?
 * 
 * A. Two
 * B. Three
 * C. Four
 * D. Six
 * 
 * Answer: C
 *
 */
class Dog {

	public Dog() {
		try {
			throw new Exception();
		}catch (Exception e) {
			
		}
	}
}

public class Q15 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = d2;
		
	
	}
}
