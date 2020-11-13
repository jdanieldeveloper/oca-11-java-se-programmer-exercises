package com.troytech.oca11.part3;

public class Q35 {

    public void analyze(Object[] o) {
        System.out.println("I am an object array");
    }

    public void analyze(long[] l){
        System.out.println("I am an array");
    }

    public void analyze(Object o){
        System.out.println("I am an object");
    }

    public static void main(String[] args) {
        int[] nums = new int[10];
        new Q35().analyze(nums);
    }
}