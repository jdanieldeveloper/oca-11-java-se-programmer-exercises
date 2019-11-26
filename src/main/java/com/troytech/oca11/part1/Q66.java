package com.troytech.oca11.part1;

/**
 *
 *What is the result?
 *
 *
 * A. Found Red Found Default
 * B. Found Teal
 * C. Found Red Found Blue Found Teal
 * D. Found Red Found Blue Found Teal Found Default
 * E. Found Default
 *
 * Answer: E
 *
 * @author daniel.carvajal
 */

public class Q66 {

    public static void main(String[] args) {
        String color = "teal";

        switch (color){
            case "Red":
                System.out.print("Found Red");
            case "Blue":
                System.out.print("Found Blue");
                break;
            case "Teal":
                System.out.print("Found Teal");
            default:
                System.out.print("Found Default");

        }
    }
}