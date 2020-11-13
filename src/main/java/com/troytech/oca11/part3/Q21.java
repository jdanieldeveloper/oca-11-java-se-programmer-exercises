package com.troytech.oca11.part3;

public class Q21 {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("ABCD");

        s.replace(s.indexOf("B"), s.indexOf("B"), "Q");

        System.out.print(s);

    }
}
