package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMaxNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(0);
		al.add(25);
		al.add(300);
		
		System.out.println(al);
	
		int min = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		int max = al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		
		System.out.println("Min:: "+min);
		System.out.println("Max:: "+max);

	}

}
