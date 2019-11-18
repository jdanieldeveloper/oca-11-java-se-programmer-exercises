package com.troytech.oca11.part1;

/**
 * Which two are possible outputs?
 *
 * A. 2
 * B. 4 3 1
 * C. 1
 * D. 1 2
 *
 * Answer: A, B
 *
 * Explanation:
 * A: Output is 2 if Math.random() is greater than 0.5.
 * B: If Math.random() returns a value less equal to 0.5, the code won’t throw an exception,
 * it will continue with the doMore() method which will println “4” after which the program
 * will continue with the doStuff() method and will println “3”, after that we will be
 * back in main() and the program will print “1”.
 *
 * @author daniel.carvajal
 *
 * */


public class Q44 {

    public static void main(String[] args) {
        try {
            doStuff();
            System.out.println("1");
        } catch(RuntimeException e) {
            System.out.println("2");
        }
    }

    public static void doStuff(){
        if(Math.random() > 0.5) throw  new RuntimeException();
        doMoreStuff();
        System.out.println("3");
    }

    public static void doMoreStuff() {
        System.out.println("4");
    }
}