package com.predicate;

import java.util.function.Predicate;

public class PredicateTest1 {

	public static void main(String[] args) {

		Predicate<Integer> p = i-> i%2==0;
		
		System.out.println(p.test(3));
		System.out.println(p.test(10));

	}

}
