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
public class Q8 {

	public static void main(String[] args) {
		int arr[] = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		int sum = 0;
		try {
			for (int pos = 0; pos <= 4; pos++) { sum = sum + arr[pos];
			}
		} catch (Exception e) { System.out.println("Invalid index");
		} System.out.println(sum);
	}
		
	}

}
