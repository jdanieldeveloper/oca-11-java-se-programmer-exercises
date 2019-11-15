package com.troytech.oca11.part1;

/**
 * What is the result?
 *
 *
 * A. Invalid Divisor Divisor Changed Successful Division 30
 * B. Invalid Divisor Successful Division 30
 * C. Invalid Divisor Exception in thread "main" java.lang.ArithmeticException: / by zero at test.Teagle.main(Teagle.java:14)
 * D. Invalid Divisor Exception in thread "main" java.lang.ArithmeticException: / by zero at test.Teagle.main(Teagle.java:14) Successful Division 1
 *
 * Answer: C
 *
 * @author daniel.carvajal
 */

public class Q37 {

    public static void main(String[] args) {
        int ax = 10, az = 30;
        int aw = 1, ay = 1;
        try {
            aw = ax%2; ay = az/aw;
        }catch (ArithmeticException e1){
            System.out.println("Invalid Divisor");
        }catch (Exception e2){
            aw = 1;
            System.out.println("Divisor Changed");
        }
        ay = az/aw; //Line 14
        System.out.println("Sucessful Division" + ay);
    }
}