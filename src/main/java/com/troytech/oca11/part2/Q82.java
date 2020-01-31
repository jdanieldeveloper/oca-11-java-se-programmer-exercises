package com.troytech.oca11.part2;

import java.util.ArrayList;
import java.util.List;

interface Contract {}
class Super implements Contract {}
class Sub extends Super{}

public class Q81 {

	 public static void main(String args[]) {
		 List objs = new ArrayList();

		 Contract c1 = new Super();
		 Contract c2 = new Sub();
		 Super s1 = new Sub();

		 objs.add(c1);
		 objs.add(c2);
		 objs.add(s1);

		 for(Object item : objs){
		 	System.out.println(item.getClass().getSimpleName());
		 }
	}
}


