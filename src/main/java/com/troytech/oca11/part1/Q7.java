package com.troytech.oca11.part1;



/**
 *
 * Which pair of load and modify statement should be inserted in the code? The load statement
 * should set the array's x row and y column value to the sum of x and y The modify statement
 * should modify the array's x row and y column value by multiplying it by 2
 * A. Load statement: array2d(x, y) = x + y;
 * Modify statement: array2d(x, y) = array2d(x, y) * 2
 * B. Load statement: array2d[x y] = x + y;
 * Modify statement: array2d[x y] = array2d[x y] * 2
 * C. Load statement: array2d[x, y] = x + y;
 * Modify statement: array2d[x, y] = array2d[x, y] * 2
 * D. Load statement: array2d[x][y] = x + y;
 * Modify statement: array2d[x][y] = array2d[x][y] * 2
 * E. Load statement: array2d[[x][y]] = x + y;
 * Modify statement: array2d[[x][y]] = array2d[[x][y]] * 2
 *
 * Answer: D
 */

public class Q7 {
	public static void main(String[] args) {
		int[][] array2d = new int[2][3];
		
		System.out.println("Loading the data");
		for (int x = 0; x < array2d.length; x++) {
			for (int y = 0; y < array2d[0].length; y++) {
				System.out.println("x = " + x);
				System.out.println("y = " + y);
				// answer
				array2d[x][y] = x + y;
				
			}
		}
		
		System.out.println("Modify the data");
		for (int x = 0; x < array2d.length; x++) {
			for (int y = 0; y < array2d[0].length; y++) {
				System.out.println("x = " + x);
				System.out.println("y = " + y);
				// answer
				array2d[x][y] = array2d[x][y] * 2;
			}
		}
	}
}
