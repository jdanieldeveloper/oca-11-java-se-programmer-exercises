package com.troytech.oca11.part1;

/**
 * What is the result?
 *
 *
 * A. Initialized Started
 * B. Initialized Started Initialized
 * C. Compilation fails
 * D. An exception is thrown at runtime
 *
 * Answer: C
 *
 * @author daniel.carvajal
 */


class Caller {
    private void init(){
        System.out.println("Initialized");
    }

    public void start(){
        init();
        System.out.println("Started");
    }
}

public class Q34 {

    public static void main(String[] args) {
        Caller c = new Caller();
        c.start();
        c.init();
    }
}