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


public class Q75 {
    static boolean bVar;
    public static void main(String args[]){
        boolean bVar1 = true;
        int count = 8;
        do {
            System.out.print("Hello Java!" + count);
            if(count >= 7) {
                bVar1 = false;
            }
        }while (bVar1 != bVar1 && count > 4);
        count -=2;
    }
}