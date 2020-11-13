package com.troytech.oca11.part3;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

    public static void main(String[] args) {
        System.out.print("Is palindrome abccba : " + Palindrome.isPalindorme("abccba"));

        //TODO overloading the palindrome class and test the characters

    }
}// end class


class Elements {

    public static void mostPopularNumber(int[] numbers, int length){
        List<Integer> numberRepeats = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    numberRepeats.add(numbers[i]);
                }
            }

            //
        }
    }


}



