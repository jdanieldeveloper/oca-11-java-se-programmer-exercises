package com.troytech.oca11.part3;

public class Q29 {
    public static void main(String[] args) {
        String s1 = new String("ORACLE");
        String s2 = "ORACLE";
        String s3 = s1.intern();

        System.out.print((s1==s2) + " ");
        System.out.print((s2==s3) + " ");
        System.out.print(s1==s3);

    }
}
