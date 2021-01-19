package com.function;

import java.util.function.Function;

public class Function2 {

	public static void main(String[] args) {

		// To return length of a string
		Function<String, Integer> f = s -> s.length();
		
		String[] names = {"Venkateswarlu", "Kishore", "Mani", "Sunil Reddy" };

		for(String name : names ) {
			System.out.println(name+":: "+f.apply(name));
		}
		
		
	}

}
