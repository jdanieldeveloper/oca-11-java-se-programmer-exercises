package com.troytech.oca11.part1;


/**
 *
 * What is the result?
 *
 * A. 3 false 1
 * B. 2 true 3
 * C. 2 false 3
 * D. 3 true 1
 * E. 3 false 3
 * F. 2 true 1
 * G. 2 false 1
 *
 * Answer: D
 * Explanation:
 * The length of the element with index 0, {0, 1, 2}, is 3. Output: 3
 * The element with index 1, {3, 4, 5, 6}, is of type array. Output: true
 * The element with index 0, {0, 1, 2} has the element with index 1: 1. Output: 1
 *
 */
public class Q18 {

    public static void main(String[] args){

        int[][] array2D = {{0,1,2}, {3,4,5,6}};

        System.out.println(array2D[0].length + " ");
        System.out.println(array2D[1].getClass().isArray() + " ");
        System.out.println(array2D[0][1]);

    }
}
