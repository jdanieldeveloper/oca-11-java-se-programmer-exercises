package com.troytech.oca11.part3;

public class Q26 {
    public static void main(String[] args) {
        char[][] arrays = {{'a', 'd'}, {'b', 'e'}, {'c', 'f'}};
        for(char[] xx : arrays){
            for(char yy : xx) {
                System.out.print(yy);
            }
            System.out.print(" ");
        }
    }
}
