package com.source;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparator {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(20);
		al.add(40);

		System.out.println(al);
		Comparator<Integer> c = (i1, i2) -> (i1<i2) ? -1 : (i1>i2) ? 1 : 0;

		Collections.sort(al, c);
		System.out.println(al);
		
	}

}
