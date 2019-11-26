package com.troytech.oca11.part1;

/**
 *
 * Which code fragment prints Hello World?
 *
 *
 * A. sb.insert(0,"Hello "); System.out.println(sb);
 * B. sb.append(0,"Hello "); System.out.println(sb);
 * C. sb.add(0,"Hello "); System.out.println(sb);
 * D. sb.set(0,"Hello "); System.out.println(sb);D
 *
 *
 * Answer: A
 *
 * Explanation: The java.lang.StringBuilder.insert(int offset, char c) method inserts the string representation of the char argument into this sequence.
 * The second argument is inserted into the contents of this sequence at the position indicated by offset. The length of this sequence increases by one.
 * The offset argument must be greater than or equal to 0, and less than or equal to the length of this sequence.
 *
 * Reference: Java.lang.StringBuilder.insert() Method
 *
 * @author daniel.carvajal
 */

public class Q68 {

    public static void main(String[] args) {
        String h1 = "Bob";
        String h2 = new String("Bob");

        // B is correct
        h1.equals(h2);
    }
}