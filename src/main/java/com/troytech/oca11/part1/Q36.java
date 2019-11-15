package com.troytech.oca11.part1;

/**
 * Which code fragment cause a compilation error?
 *
 *
 * A. flat flt = 100F;
 * B. float flt = (float) 1_11.00;
 * C. float flt = 100;
 * D. double y1 = 203.22; floatflt = y1
 * E. int y2 = 100; floatflt = (float) y2;
 *
 *
 * Answer: D
 *
 * @author daniel.carvajal
 */

public class Q36 {

    public static void main(String[] args) {
        float flt = 100F;
        float flt1 = (float) 1_11.00;
        float flt2 = 100;
        double y1 = 203.22; float flt3 = y1;
        int y2 = 100; float flt4 = (float) y2;
    }
}