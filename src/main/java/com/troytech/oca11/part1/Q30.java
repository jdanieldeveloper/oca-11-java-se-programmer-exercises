package com.troytech.oca11.part1;

/**
 *
 * What should statement1, statement2, and statement3, be respectively, in order to produce the result?
 *
 * A. ns = 50 S = 125 ns = 125 S = 125 ns = 100 S = 125
 * B. ns = 50 S = 125 ns = 125 S = 125 ns = 0 S = 125
 * C. ns = 50 S = 50 ns = 125 S = 125 ns = 100 S = 100
 * D. ns = 50 S = 50 ns = 125 S = 125 ns = 0 S = 125
 *
 * Answer: B
 *
 * @author daniel.carvajal
 *
 */

class Alpha {
	int ns;
	static int s;
	Alpha(int ns) {
		if(s < ns){
			s = ns;
			this.ns = ns;
		}
	}

	void doPrint() {
		System.out.println("ns = " + ns + " s = " + s);
	}
}


public class Q30 {

	public static void main(String[] args) {
		Alpha ref1 = new Alpha(50);
		Alpha ref2 = new Alpha(125);
		Alpha ref3 = new Alpha(100);

		ref1.doPrint();
		ref2.doPrint();
		ref3.doPrint();
	}
}