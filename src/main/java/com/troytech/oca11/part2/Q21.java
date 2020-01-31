package com.troytech.oca11.part2;


import java.util.ArrayList;
import java.util.List;

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
public class Q9 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		for(int i: array){
			if(i < 2){
				continue;
			}
			System.out.print(i);
			if(i == 3){
				continue;
			}
		}

		List<Integer> integer = new ArrayList<>();
		integer.removeIf(e -> e % 2 == 0);
	}
}
