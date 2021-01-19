package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(3);
		al.add(75);
		al.add(20);
		al.add(50);
		al.add(300);
		
		System.out.println(al);
	
		List<Integer>  list= al.stream().sorted((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
		
		System.out.println(list);
		
	}

}
