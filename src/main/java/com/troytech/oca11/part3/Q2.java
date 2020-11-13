package com.troytech.oca11.part3;

public class Q2 {

    public static void main(String[] args) {
        System.out.print("Is palindrome abccba : " + Palindrome.isPalindorme("abccba"));

        //TODO overloading the palindrome class and test the characters

    }
}// end class


class Palindrome {

    public static boolean isPalindorme(String word){
        boolean isPalindrome = false;
        StringBuilder wordReverse = new StringBuilder(word);
        if(word.equalsIgnoreCase(wordReverse.reverse().toString())){
            isPalindrome = true;
        }
        return  isPalindrome;
    }
}



