package com.troytech.oca11.part1;


/**
 *
 * Which two statements, when inserted independently at line // insert code here, enable the code to compile?
 *
 * A. int [] [] arr = null;
 * B. int [] [] arr = new int [2];
 * C. int [] [] arr = new int [2] [ ];
 * D. int [] [] arr = new int [] [4];
 * E. int [] [] arr = new int [2] [0];
 * F.  int [] [] arr = new int [0] [4];
 *
 * Answer: C, E
 *
 * @author daniel.carvajal
 *
 *
 * */

public class Q54 {

    public static void main(String[] args) {
        //insert code here
        //A.
        //int[][] arr = new int[2][];

        //E
        int[][] arr = new int[2][0];

        arr[0] = new int[3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1] = new int[4];
        arr[1][0] = 10;
        arr[1][1] = 20;
        arr[1][2] = 30;
        arr[1][3] = 40;

    }
}