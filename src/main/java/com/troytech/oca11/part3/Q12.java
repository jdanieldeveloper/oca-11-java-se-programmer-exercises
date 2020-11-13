package com.troytech.oca11.part3;

public class Q12 {
    private int x;
    private static int y;

    public static void main(String args[]) {
        Q12 t1 = new Q12();
        t1.x = 2;
        Q12.y = 3;
        Q12 t2 = new Q12();
        t2.x = 4;
        t2.y = 5;

        System.out.println(t1.x + "," + t1.y);
        System.out.println(t2.x + "," + Q12.y);
        System.out.println(t2.x + "," + t1.y);

    }
}
