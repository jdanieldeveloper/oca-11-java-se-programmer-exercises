package com.troytech.oca11.part1;

/**
 *
 * What is the result?
 *
 * A. : Fresco
 * B. null : Fresco
 * C. Fresco : Fresco
 * D. A NullPointerException is thrown at runtime
 *
 * Answer: B
 *
 * @author daniel.carvajal
 */

class Painting {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

public class Q71 {
    public static void main(String args[]){
        Painting obj1 = new Painting();
        Painting obj2 = new Painting();
        obj1.setType(null);
        obj2.setType("Fresco");
        System.out.print(obj1.getType() + ":" + obj2.getType());
    }
}