package com.troytech.oca11.part1;

/**
 * What is the result?
 *
 *
 * A. 3 4 5 6
 * B. 3 4 3 6
 * C. 5 4 5 6
 * D. 3 6 4 6
 *
 * Answer: C
 *
 * @author daniel.carvajal
 */

class XX {
    static int i;
    int j;
}

public class Q35 {

    public static void main(String[] args) {
        XX x1 = new XX();
        XX x2 = new XX();
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;

        System.out.println(x1.i + " " + x1.j + " " + x2.i + " " + x2.j);
    }
}