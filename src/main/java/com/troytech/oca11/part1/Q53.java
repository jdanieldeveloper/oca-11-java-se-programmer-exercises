package com.troytech.oca11.part1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * What is the result?
 *
 * A. Super Sub Sub
 * B. Contract Contract Super
 * C. Compilation fails at line n1
 * D. Compilation fails at line n2
 *
 * Answer: A
 *
 * @author daniel.carvajal
 *
 *
 * */

public class Q53 {

    public static void main(String[] args) {
        int a = 0, z = 10;
        while(a < z ){
            a++;
            z--;
        }
        System.out.print(a + " : " + z);
    }
}