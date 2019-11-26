package com.troytech.oca11.part1;

/**
 *
 *What is the result?
 *
 *
 * A. aa cc B. aa bb cc C. cc dd D. cc E. Compilation fails.
 *
 *
 * Answer: A
 *o8p
 *
 *
 * @author daniel.carvajal
 */


public class Q80 {
    static boolean bVar;
    public static void main(String args[]){
        String[] table = {"aa", "bb", "cc", "dd"};
        for(String ss: table){
            if("bb".equals(ss)){
                continue;
            }
            System.out.print(ss);
            if("cc".equals(ss)){
                break;
            }
        }
    }
}