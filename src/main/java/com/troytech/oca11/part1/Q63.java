package com.troytech.oca11.part1;


import java.util.ArrayList;

/**
 *
 * What is the result?
 *
 * A. Compilation fails due to an error on line 1.
 * B. An exception is thrown at run time due to error on line 3
 * C. An exception is thrown at run time due to error on line 4
 * D. 1002
 *
 * Answer: C
 *
 * Explanation:  The code compiles fine. At runtime an IndexOutOfBoundsException is thrown when the second list item is added.
 *
 * @author daniel.carvajal
 */

public class Q63 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(1);
        list.add(1001);
        list.add(1002);
        System.out.println(list.get(list.size()));
    }
}