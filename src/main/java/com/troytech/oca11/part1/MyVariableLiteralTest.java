package com.troytech.oca11.part1;

public class MyVariableLiteralTest { //top level class
    public int myfield;

    private MyVariableLiteralTest(){ };

    private MyVariableLiteralTest(int i){ }

    public static void main(String[] args) {

        int _variable_ = 1_0000;
        //start with 0b or 0B
        int binary = 0B010101;

        //start with 0
        int octal = 01517;
        // start
        int hexadecimal = 0X521B5;

        //example by byte
        byte mybit = 127;

        long myLong = 12789L;

        takeTheShorterThanTypeVariable(myLong);

        MyVariableLiteralTest myClazz = new MyVariableLiteralTest();
        System.out.print(myClazz.myfield);

        //MyVariableLiteralTest.myInferStaticClass

    }

    public static void takeTheShorterThanTypeVariable(int myVariable) {
        //TODO implement
    }

    static class myInnerStaticClass { //inner class

    }
}