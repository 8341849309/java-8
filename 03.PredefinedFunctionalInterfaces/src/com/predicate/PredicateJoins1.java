package com.predicate;

import java.util.function.Predicate;

public class PredicateJoins1 {

	public static void main(String[] args) {

		// To check even or not
		Predicate<Integer> p1 = i -> i%2==0;
		
		// To check >10
		Predicate<Integer> p2 = i -> i>10;
		
		
		int[] x = {5, 10, 15, 20, 25, 30};
		
		System.out.println(" >10 and even numbers");
		
		for (int i : x) {
			
			/*
			if(p1.and(p2).test(i)) {
				System.out.println(i);
			}
				*/
			if(p1.or(p2).test(i)) {
				System.out.println(i);
			}
			
		}

	}

}
