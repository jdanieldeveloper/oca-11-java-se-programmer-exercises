package com.troytech.oca11.part1;

/**
 *
 * What is the result?
 *
 * A. : Fresco
 * B. null : Fresco
 * C. Fresco : Fresco
 * D. A NullPointerException is thrown at runtime
 *
 * Answer: B
 *
 * @author daniel.carvajal
 */


public class Q73 {
    public static void main(String args[]){
        boolean log3 = (5.0 != 6.0) && (4 != 5);
        boolean log4 = (4!=4) || (4 == 4);
        System.out.print("log3: " + log3 + "\nlog4: " + log4);
    }
}