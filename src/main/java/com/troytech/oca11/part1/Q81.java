package com.troytech.oca11.part1;

/**
 *
 * How many times is 2 printed as a part of the output?
 *
 * A. Zero
 * B. Once
 * C. Twice
 * D. Thrice
 * E. Compilation fails.
 *
 * Answer: D
 *
 * @author daniel.carvajal
 */


public class Q81 {
    public static void main(String args[]){
        String[] table = {"aa", "bb", "cc"};
        for(String ss: table){
            int ii = 0;
            while(ii < table.length){
                System.out.print(ss + ", " + ii);
                ii++;
            }
        }
    }
}