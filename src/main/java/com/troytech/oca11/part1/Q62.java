package com.troytech.oca11.part1;


/**
 * What is the result?
 *
 * A. 6 7 8
 * B. 7 8 9
 * C. 0 1 2
 * D. 6 8 10
 * E. Compilation fails
 *
 * Answer: A
 *
 * @author daniel.carvajal
 */

public class Q62 {

    public static void main(String[] args) {
        int[] x = {6, 7, 8};
        for(int i : x){
            System.out.print(i + " ");
            i++;
        }
    }
}