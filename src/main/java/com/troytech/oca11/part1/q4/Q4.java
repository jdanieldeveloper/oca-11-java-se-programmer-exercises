package com.troytech.oca11.part1.q4;


/**
 *
 * What is the result?
 *
 * Which two statements are true?
 * A. An abstract class can implement an interface.
 * B. An abstract class can be extended by an interface.
 * C. An interface CANNOT be extended by another interface.
 * D. An interface can be extended by an abstract class.
 * E. An abstract class can be extended by a concrete class.
 * F. An abstract class CANNOT be extended by an abstract class.
 *
 * Answer: A, E because It's true
 *
 */


public class Q4 {
}


/**
 *
 * A. An abstract class can implement an interface.
 * Answer: yes, we can use implements keyword
 *
 */

interface MyInterfaceA {

}
abstract class MyAbastractA implements MyInterfaceA { // true
}

/**
 *
 * B. An abstract class can be extended by an interface.
 * Answer: false, we can't use extends keyword
 *
 */
interface MyInterfaceB {
}
abstract class MyAbstractB extends MyInterfaceB { // false
}

/**
 *
 * C. An interface CANNOT be extended by another interface.
 * Answer: false, it's possible
 *
 */
interface MyInterfaceC1 {
}
interface MyInterfaceC2 extends MyInterfaceC1 { //false
}

/**
 *
 * D. An interface can be extended by an abstract class.
 * Answer: false, it isn't possible
 *
 */
abstract class MyAbastractD {
}
interface MyIntefaceD extends MyAbastractD { // false
}

/**
 *
 * E. An abstract class can be extended by a concrete class.
 * Answer: true, it's possible
 *
 */
class MyConcreteClass{
}
class MyAbstractE extends MyConcreteClass {
}

/**
 *
 * F. An abstract class CANNOT be extended by an abstract class.
 * Answer: yes, it's possible
 *
 */
class MyAbstractF1 {
}
class MyAbstractF2 extends MyAbstractF1 {
}









