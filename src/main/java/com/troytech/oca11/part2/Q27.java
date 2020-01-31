package com.troytech.oca11.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * What is the result?
 *
 * A. 12
 * B. Invalid Index 12
 * C. Invalid Index
 * D. Compilation fails
 *
 *
 * Answer: B
 *
 */

class Alpha {
	public String doStuff(String msg){
		return msg;
	}
}

class Beta extends Alpha {
	public String doStuff(String msg){
		return msg.replace('a', 'e');
	}
}

class Gamma extends Beta {
	public String doStuff(String msg){
		return msg.substring(2);
	}
}

public class Q21 {

	public static void main(String[] args) {
		List<Alpha> strs = new ArrayList<Alpha>();
		strs.add(new Alpha());
		strs.add(new Beta());
		strs.add(new Gamma());
		for(Alpha t : strs) {
			System.out.print(t.doStuff("Java"));
		}
	}
}
