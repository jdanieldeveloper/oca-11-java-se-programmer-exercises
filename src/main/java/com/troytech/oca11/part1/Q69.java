package com.troytech.oca11.part1;

/**
 *
 * What is the result?
 *
 *
 * A. Hello B. Default
 * C. Compilation fails
 * D. The program prints nothing
 * E. An exception is thrown at run time
 *
 * Answer: A
 *
 * Explanation:  The program compiles fine. The program runs fine. The output is: hell
 *
 * @author daniel.carvajal
 */

class X5 {
    String str = "default";
    X5(String s) { str = s; }
    void print(){ System.out.print(str);}
}

public class Q69 {

    public static void main(String[] args) {
      new X5("Hola").print();

    }
}