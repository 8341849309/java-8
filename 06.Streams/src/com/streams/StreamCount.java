package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCount {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		
		System.out.println(al);
	
		int count1 = (int) al.stream().map(i->i+5).count();
		long count2 = al.stream().count();
		
		System.out.println(count1);
		System.out.println(count2);
		
	}

}
