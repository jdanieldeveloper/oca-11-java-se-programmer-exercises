package com.troytech.oca11.part1;

/**
 * Which two modifications, made independently, enable the code to compile and run?
 *
 *
 * A. Adding a break statement after each print statement
 * B. Adding a default section within the switch code-block
 * C. Changing the string literals in each case label to integer
 * D. Changing the type of the variable day to String
 * E. Arranging the case labels in ascending order
 *
 *  Answer: A, C
 *
 * @author daniel.carvajal
 *
 * */


public class Q45 {

    public static void main(String[] args) {
        int day = 1;

        // Question
       // switch (day) {
            //case "7": System.out.print("Uranus");
            //case "6": System.out.print("Saturn");
            //case "1": System.out.print("Mercury");
            //case "2": System.out.print("Venus");
            //case "3": System.out.print("Earth");
            //case "4": System.out.print("Mars");
            //case "5": System.out.print("Jupiter");
        //}

        // Resp:
        switch (day) {
            case 7:
                System.out.print("Uranus");
                break;
            case 6:
                System.out.print("Saturn");
                break;
            case 1:
                System.out.print("Mercury");
                break;
            case 2:
                System.out.print("Venus");
                break;
            case 3:
                System.out.print("Earth");
                break;
            case 4:
                System.out.print("Mars");
                break;
            case 5:
                System.out.print("Jupiter");
                break;
        }
    }
}