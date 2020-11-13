package com.troytech.oca11.part1;

/**
 * //TODO por definir
 *
 * Answer: D
 *
 * @author daniel.carvajal
 */

public class Q97 {
    public static void main(String args[]) {
        Q97 t = new Q97();

        System.out.print(isAvailable + " ");
        isAvailable = t.doStuff();
        System.out.print(isAvailable);

    }

    public static boolean doStuff(){
        return !isAvailable;
    }

    static boolean isAvailable = false;
}