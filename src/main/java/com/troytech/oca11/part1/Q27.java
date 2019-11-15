package com.troytech.oca11.part1;

/**
 *
 * What will make this code compile and run?
 *
 * A. Change line 2 to the following: Public int price
 * B. Change line 4 to the following: int price = new simple ();
 * C. Change line 4 to the following: Float price = new simple ();
 * D. Change line 5 to the following: Price = 4f;
 * E. Change line 5 to the following: price.price = 4;
 * F. Change line 5 to the following: Price = (float) 4:
 * G. Change line 5 to the following: Price = (Simple) 4;
 * H. The code compiles and runs properly; no changes are necessary
 *
 * Answer: E
 *
 * Explanation:  price.price =4; is correct, not price=4; The attribute price of the instance must be set, not the instance itself
 *
 * @author daniel.carvajal
 *
 */

class Simple {
	public float price;
}

public class Q27 {

	public static void main(String[] args) {
		Simple price = new Simple();
		//price = 4;
		price.price = 4;
	}
}