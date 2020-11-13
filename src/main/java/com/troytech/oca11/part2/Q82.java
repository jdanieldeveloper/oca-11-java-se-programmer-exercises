package com.troytech.oca11.part2;

class Marklist {
	int num;

	public static void graceMarks(Marklist obj4) {
		obj4.num += 10;
	}
}

public class Q82 {

	 public static void main(String args[]) {
		 Marklist obj1 = new Marklist();
		 Marklist obj2 = obj1;
		 Marklist obj1 = null;
		 obj2.num = 60;
		 obj1.graceMarks(obj2);
	}
}


