package com.troytech.oca11.part1;


/**
 *
 * Which is a valid abstract class?
 *
 * A. public abstract class Car { protected void accelerate();}
 * B. public interface Car {protected abstract void accelerate();}
 * C. public abstract class Car { protected final void accelerate();}
 * D. public abstract class Car { protected abstract void accelerate();}
 * E. public abstract class Car { protected abstract void accelerate() { //more car can do}}
 *
 * Answer: D
 *
 * @author daniel.carvajal
 *
 *
 * */

public class Q57 {

    public static void main(String[] args) {
        int iArray[] = {65, 68, 69};
        iArray[2] = iArray[0];
        iArray[0] = iArray[1];
        iArray[1] = iArray[2];
        for(int element : iArray){
            System.out.print( element + " ");
        }
    }
}