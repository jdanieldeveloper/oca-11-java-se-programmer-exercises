package com.troytech.oca11.part2;

class Series{
	private  boolean flag;

	public void displaySeries() {
		int num = 2;
		while(flag) {
			if(num % 7 == 0)
				flag = false;
			System.out.print(num);
			num += 2;
		}
	}
}

public class Q88 {
	 public static void main(String args[]) {
		new Series().displaySeries();
	 }
}


