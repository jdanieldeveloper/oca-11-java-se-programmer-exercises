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

public class Q37 {

	public static void doChange(int[] arr) {
		for(int pos = 0; pos < arr.length; pos++){
			arr[pos] = arr[pos] + 1;
		}
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		doChange(arr);
		for(int x : arr){
			System.out.print(x + " ");
		}

		//doChange(arr[0], arr[1], arr[2]);
	}
}
