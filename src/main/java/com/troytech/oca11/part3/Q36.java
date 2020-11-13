package com.troytech.oca11.part3;

import java.util.Arrays;

public class Q36 {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 3, 2, 1};
        int ent = 3;

        System.out.println(String.format(
                "The number %s exists %s times into the array %s", ent, countIfContains(arr, ent), Arrays.toString(arr)));

        Integer a = 3;
        Integer b = 3;

        System.out.println(a == b);

    }

    public static int countIfContains(int[] arr, int ent) {
        int count = 0;
        for (int e : arr) {
            if (e == ent) {
                count++;
            }
        }
        return count;
    } // end function
}// end class

