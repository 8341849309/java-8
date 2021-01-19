package com.twoargs;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> p = (a, b) -> {

			return a + b > 100;
		};
		
		System.out.println(p.test(50, 100)); // true
		System.out.println(p.test(30, 45)); // false
	}

}
