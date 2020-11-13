package com.troytech.oca11.part3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q30 {
    public static void main(String[] args) {
        String[] fruitName = {"apple", "orange", "grape", "lemon", "apricot", "watrmelon"};
        var fruits = new ArrayList<>(Arrays.asList(fruitName));
        fruits.sort((var a, var b ) -> -a.compareTo(b));
        fruits.forEach(System.out::println);
    }
}
