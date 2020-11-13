package com.troytech.oca11;

public class TestOverload {

    static void doSomething(Integer i, short s) {
        System.out.print("1");
    }

    static void doSomething(int in, Short s) {
        System.out.print("1");
    }

    static void processData(Object obj){
    }

    static void processData(String str){}

    public static void main(String[] args) {
        int b = 10;
        short x = 20;
        //doSomething(b, x);

        processData("Hello");
    }
}
