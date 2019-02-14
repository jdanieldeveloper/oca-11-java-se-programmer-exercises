package com.troytech.oca8.part1;

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
