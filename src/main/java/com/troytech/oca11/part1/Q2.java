package com.troytech.oca11.part1;

public class Q2 {

}

/**
 * 
 * This class needs to protect an invariant on the sum field. Which three
 * members must have the private access modifier to ensure that this invariant
 * is maintained?
 * 
 * A. The x field 
 * B. The y field
 * C. The sum field 
 * D. The ComputerSum ( ) constructor 
 * E. The setX ( ) method 
 * F. The setY ( ) method
 * 
 *
 */
class ComputeSum {
	public int x;
	public int y;
	public int sum;

	public ComputeSum(int nx, int ny) {
		x = nx;
		y = ny;
		updateSum();
	}

	public void setX(int nx) {
		x = nx;
		updateSum();
	}

	public void setY(int ny) {
		x = ny;
		updateSum();
	}

	void updateSum() {
		sum = x + y;
	}
}

/**
 * 
 * Answer: C, E, F -> Because, invariants is keep the state the class and rules integrity
 * 
 * 
 */

class ComputeSumResolve {
	public int x;
	public int y;
	private int sum;

	public ComputeSumResolve(int nx, int ny) {
		x = nx;
		y = ny;
		updateSum();
	}

	private void setX(int nx) {
		x = nx;
		updateSum();
	}

	private void setY(int ny) {
		x = ny;
		updateSum();
	}

	void updateSum() {
		sum = x + y;
	}
}
