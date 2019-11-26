package com.troytech.oca11.part1;

/**
 *
 * Which code fragments, inserted independently, enable the code compile?
 *
 * A. t.fvar = 200;
 * B. cvar = 400;
 * C. fvar = 200; cvar = 400;
 * D. this.fvar = 200; this.cvar = 400;
 * E. t.fvar = 200; Test2.cvar = 400;
 *
 * Answer: A, B, E
 *
 * @author daniel.carvajal
 *
 * */

public class Q51 {
    int fvar;
    static int cvar;

    public static void main(String[] args) {
        Q51 t = new Q51();
        // insert code here to write field variables
        // A.
        t.fvar = 200; // OK

        // B.
        cvar = 400; //OK

        // C.
        //fvar = 200; cvar = 400; //NOK

        //D
        //this.fvar = 200; this.cvar = 400; //NOK

        //E
        t.fvar = 200; Q51.cvar = 400; //OK

        //F
        //this.fvar = 200; Q51.cvar = 400;
    }
}