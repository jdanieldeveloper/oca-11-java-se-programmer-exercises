package com.troytech.oca11.part1;

/**
 * //TODO por definir
 *
 * Answer: D
 *
 * @author daniel.carvajal
 */

class Start {
    public void doStuff() {
        System.out.println("Twinkling Start");
    }
}

interface  Universe {
    public void doStuff();
}

class Sun extends Start implements Universe {

    public void doStuff() {
        System.out.println("Shining Sun");
    }
}

public class Q93 {
    public static void main(String args[]) {
        Sun obj2 = new Sun();
        Start obj3 = obj2;
        ((Sun) obj3).doStuff();
        ((Start) obj2).doStuff();
        ((Universe) obj2).doStuff();
    }
}