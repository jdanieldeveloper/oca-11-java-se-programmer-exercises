package com.troytech.oca8.part1;


/**
 * What is the result?
* A. 6 564
* B. 6 554
* C. 6 566
* D. 6 565
*
* Answer: A
* 
* Explanation:
* Within main z is assigned 6. z is printed. Output: 6
* Within doStuff z is assigned 5.DoStuff2 locally sets z to 4 (but MyScope.z is set to 4), but in
* Dostuff z is still 5. z is printed. Output: 5
* Again z is printed within main (with local z set to 6). Output: 6
* Finally MyScope.z is printed. MyScope.z has been set to 4 within doStuff2(). Output: 4
 * 
 * @author daniel.carvajal
 *
 */
public class Q21 {
	int z;
	
	public static void main(String[] args) {
		Q21 myScope = new Q21();
		int z = 6;
		System.out.println(z);
		myScope.doStuff();
		System.out.println(z);
		System.out.println(myScope.z);
	}
	
	void doStuff() {
		int z = 5;
		doStuff2();
		System.out.println(z);
	}
	
	void doStuff2() {
		z = 4;
	}

}
