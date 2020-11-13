package com.troytech.oca11.part3;

public class Q31 {
    public static void main(String[] args) {
        int x = 0;
        while(x < 10){
            System.out.print(x++);
        }
        System.out.print("\n--------------------------------------------------\n");

        int b = 0;
        for( ; b < 10; ){
            System.out.print(++b);
        }
        System.out.print("\n--------------------------------------------------\n");

        for(int d = 0; d < 10;) {
            System.out.print(d);
            ++d;
        }

    }
}
