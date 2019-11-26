package com.troytech.oca11.part1;

/**
 *
 * What is the result?
 *
 * A. null
 * B. compilation fails
 * C. Java.lang.NullPointerException
 * D. 0
 *
 * Answer: A
 *
 * @author daniel.carvajal
 */


public class Q74 {
    public static void main(String args[]){
        int[] xx = null;
        for(int ii : xx){
            System.out.print(ii);
        }
    }
}