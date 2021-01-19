package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		
		System.out.println(al);

		List<Integer> list = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		long count = al.stream().filter(i->i%2==0).count();
		
		System.out.println(list);
		System.out.println(count);
		
	}

}
