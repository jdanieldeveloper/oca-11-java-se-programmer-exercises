package com.troytech.oca11.part1;

/**
 *
 * What is the result?
 *
 *
 * A. Found 3 at 2
 * B. Found 3 at 3
 * C. Compilation fails
 * D. An exception is thrown at runtime
 *
 *
 * Answer: C
 *
 * Explanation: The following line does not compile: System.out.print("Found " + key + "at " + pos);
 * The variable pos is undefined at this line, as its scope is only valid in the for loop.
 * Any variables created inside of a loop are LOCAL TO THE LOOP
 *
 * @author daniel.carvajal
 */


public class Q76 {
    static boolean bVar;
    public static void main(String args[]){
        int array[] = {0, 1, 2, 3, 4};
        int key = 3;
        for(int pos = 0; pos < array.length; ++pos){
            if(array[pos] == key){
                break;
            }
        }
        // fail
        //System.out.print("Found " + key + "at" + pos);
    }
}