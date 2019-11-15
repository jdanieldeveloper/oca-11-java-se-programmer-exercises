package com.troytech.oca11.part1;

/**
 * What is the result?
 * <p>
 * <p>
 * A. 0
 * B. 0 12
 * C. 0 12012012
 * D. Compilation fails
 *
 * @author daniel.carvajal
 */

public class Q33 {

    public static void main(String[] args) {
        String[] table = {"aa", "bb", "cc"};
        int ii = 0;
        do
            while (ii < table.length)
                System.out.println(ii++);
        while (ii < table.length);

    }
}