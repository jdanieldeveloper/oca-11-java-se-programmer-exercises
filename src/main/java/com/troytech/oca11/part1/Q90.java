package com.troytech.oca11.part1;

/**
 * What is result
 *
 * A. 1
 * B. 2
 * C. 4
 * D. 0
 *
 * Answer: D
 *
 * @author daniel.carvajal
 */


public class Q90 {
    public static void main(String args[]) {
        String[] cartoons = {"tom", "jerry", "micky", "tom"};
        int counter = 0;
        if ("tom".equals(cartoons[0])) {
            counter++;
        } else if ("tom".equals(cartoons[1])) {
            counter++;
        } else if ("tom".equals(cartoons[2])) {
            counter++;
        } else if ("tom".equals(cartoons[3])) {
            counter++;
        }

        System.out.print(counter);
    }
}