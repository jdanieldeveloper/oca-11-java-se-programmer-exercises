package com.troytech.oca11.part1;


/**
 * Which three lines will compile and output “right on!”?
 *
 *
 * A. Line 5
 * B. Line 6
 * C. Line 7
 * D. Line 8
 * E. Line 9
 * F. Line 10
 *
 * Answer: C, D, F
 *
 *
 * @author daniel.carvajal
 */

public class Q61 {

    public static void main(String[] args) {
        Speak speakIt = new Tell();
        Tell tellIt = new Tell();
        //
        //speakIt.tellItLikeItIs(); //NOK fail in compilation time
        //(Truth) speakIt.tellItLikeItIs(); //NOK fail in compilation time
        ((Truth) speakIt).tellItLikeItIs();
        tellIt.tellItLikeItIs();
        //(Truth) tellIt.tellItLikeItIs(); //NOK fail because it return void
        ((Truth) tellIt).tellItLikeItIs();
    }
}

class Speak {}

class Tell extends Speak implements Truth {

    @Override
    public void tellItLikeItIs() {
        System.out.println("Right on!");
    }
}

interface  Truth {
    public void tellItLikeItIs();
}