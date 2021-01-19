package com.function;

import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {

		// Square of a number
		Function<Integer, Integer> f = i -> i*i;
		
		System.out.println(f.apply(5));
		
		System.out.println(f.apply(12));
		
	}

}
