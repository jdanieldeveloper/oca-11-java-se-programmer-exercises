package com.troytech.oca11.part2;

class SampleClass {}

public class Q76 {

	public static void main(String args[]) {
		AnotherSampleClass asc = new AnotherSampleClass();
		SampleClass sc = new SampleClass();
		sc = asc;
		System.out.print("sc: " + sc.getClass());
		System.out.print(" |  ");
		System.out.print("asc:" + asc.getClass());

	}
}

class AnotherSampleClass extends SampleClass {}
