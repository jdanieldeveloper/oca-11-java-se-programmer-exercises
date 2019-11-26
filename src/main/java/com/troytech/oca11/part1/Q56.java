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

//A fail
abstract class Car1 {protected void accelerate();}
//B fail Itsn't a class
interface  Car2 { abstract void accelerate();}
//C fail
abstract class Car3 {protected final void accelerate();}
//D correct
abstract class Car4 {protected abstract void accelerate();}
//E fail
abstract class Car5 {protected abstract void accelerate() {
    // more car can do
}}


public class Q56 {

    public static void main(String[] args) {

    }
}