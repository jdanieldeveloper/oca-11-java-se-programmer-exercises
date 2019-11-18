package com.troytech.oca11.part1;

/**
 * What code should be inserted?
 *
 * A. Option A
 * B. Option B
 * C. Option C
 * D. Option D
 * E. Option E
 * F. Option F
 *
 *  Answer: C
 *  Explanation:  Dog should be an abstract class. The correct syntax for this is: abstract class Dog { Poodle should extend Dog (not implement).
 *
 * @author daniel.carvajal
 *
 * */


abstract class Dog3 { // insert code here
    public abstract void bark();
}

class Poodle3 extends Dog3 {
    public void bark(){
        System.out.print("woof");
    }
}

public class Q47 {

    public static void main(String[] args) {

    }
}