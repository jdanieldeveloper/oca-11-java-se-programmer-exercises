package com.troytech.oca11.part2;

/**
 * What is the result?
 *
 * A. 12
 * B. Invalid Index 12
 * C. Invalid Index
 * D. Compilation fails
 *
 *
 * Answer: B
 *
 */

public class Q29 {

	public static void main(String[] args) {
		String[] colors = {"red", "blue", "green", "yellow", "maroon", "cyan"};

		for(String c : colors ){
			if(c.length() != 4){
				continue;
			}
			System.out.print(c + ", ");
		}

		int row = 10;
		for( ; row > 0; )  {

		}

		//int[] multobject = new int [5];
		//multobject.

		int i= 0;


	}
}
