package com.troytech.oca8.part1;

/**
 * 
 * What values of x, y, z will produce the following result? 
 *  1 2 3 4
 *  1 2 3 4
 *  1 2 3 4
 *  ----
 *  1 2 3 4
 *  ----
 *  
 *  
 * A. X = 4, Y = 3, Z = 2
 * B. X = 3, Y = 2, Z = 3
 * C. X = 2, Y = 3, Z = 3
 * D. X = 4, Y = 2, Z = 3
 * E. X = 2, Y = 3, Z = 4
 *
 * Answer=E
 */
public class Q17 {

	public static void main(String[] args) {

		int j = 0, k = 0;
		int x = 2, y = 3, z = 4;

		for (int i = 0; i < x; i++) {
			do {
				k = 0;
				while (k < z) {
					k++;
					System.out.println(k + " ");
				}
				System.out.println(" ");
				j++;
			} while (j < y);
			System.out.println("-----");
		}
	}
}
