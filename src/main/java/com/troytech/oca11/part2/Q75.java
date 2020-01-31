package com.troytech.oca11.part2;

class XX {
	public void mX(){
		System.out.println("Xm1 ");
	}
}

class YY extends XX {
	public void mX() {
		System.out.print("Xm2 ");
	}
	public void mY() {
		System.out.print("Ym ");
	}
}



public class Q73 {

	public static void main(String args[]) {
		XX xRef = new YY();
		YY yRef = (YY) xRef;
		yRef.mY();
		xRef.mX();
	}
}
