package com.troytech.oca11.part1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * What is the result?
 *
 * A. Super Sub Sub
 * B. Contract Contract Super
 * C. Compilation fails at line n1
 * D. Compilation fails at line n2
 *
 * Answer: A
 *
 * @author daniel.carvajal
 *
 *
 * */

interface Contract { }
class Super implements Contract{}
class Sub extends Super {}

public class Q52 {

    public static void main(String[] args) {
        List objs = new ArrayList();

        Contract c1 = new Super();
        Contract c2 = new Sub();            // line 1
        Super s1 = new Sub();

        objs.add(c1);
        objs.add(c2);
        objs.add(s1);                       // line 2

        for(Object itm : objs){
            System.out.println(itm.getClass().getName());
        }
    }
}