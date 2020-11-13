package com.troytech.oca11.part2;


abstract  class Shape {
	private int x;
	private int y;
	public abstract  void draw();
	public void setAnchor(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

abstract class Circle extends Shape {
	private int radius;
}

public class Q53 {

	public static void main(String args[]) {


	}
}
