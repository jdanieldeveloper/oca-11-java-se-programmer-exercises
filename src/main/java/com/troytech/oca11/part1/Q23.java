package com.troytech.oca11.part1;

/**
 *
 * Which approach ensures that the class can be compiled and run?
 *
 * A. Put the throw new Exception() statement in the try block of try – catch
 * B. Put the doSomethingElse() method in the try block of a try – catch
 * C. Put the doSomething() method in the try block of a try – catch
 * D. Put the doSomething() method and the doSomethingElse() method in the try block of a try – catch
 *
 * Answer: A
 *
 * @author daniel.carvajal
 *
 */
public class Q23 {

	public static void main(String[] args) {
		doSomething();
	}

	private static void doSomething(){
		doSomethingElse();
	}

	private static void doSomethingElse() {
		//try {
			throw new Exception();
		//}catch (Exception e){

		//}
	}


}
