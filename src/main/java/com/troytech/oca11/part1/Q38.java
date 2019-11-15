package com.troytech.oca11.part1;

/**
 * What is the result?
 *
 * What would be the output, if it is executed as a program?
 *
 *
 * A. name =, pass =
 * B. name = null, pass = null
 * C. name = null, pass = false
 * D. name = null pass = true
 * E. Compile error.
 *
 * Answer: E
 *
 * @author daniel.carvajal
 */

class Whizlabs {
    private String name;
    private boolean pass;
}
public class Q38 {

    public static void main(String[] args) {
        Whizlabs wb = new Whizlabs();
        System.out.println("name = " + wb.name);
        System.out.println(", pass = " + wb.pass);
    }
}