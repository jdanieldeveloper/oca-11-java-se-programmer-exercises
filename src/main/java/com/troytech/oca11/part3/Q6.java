package com.troytech.oca11.part3;

import java.util.Arrays;

public class Q6 {

    public static void main(String args[]) {
        int[] secA = {2, 4, 6, 8, 10};
        int[] secB = {2, 4, 8, 6, 10};
        int rest1 = Arrays.mismatch(secA, secB);
        int rest2 = Arrays.compare(secA, secB);
        System.out.print(rest1 + ":" + rest2);
    }
}
