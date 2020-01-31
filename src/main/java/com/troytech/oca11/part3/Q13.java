package com.troytech.oca11;

interface  EulerInterface {
    double getEulerValue();
}

public class Q13 {

    public static void main(String args[]) {
        EulerInterface myEulerInterface;
        myEulerInterface = () -> 2.71828;
        System.out.println("Value of Euler = " + myEulerInterface.getEulerValue());
    }
}
