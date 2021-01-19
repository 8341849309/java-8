package com.consumer;

import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {

		// Takes the given object and prints it
		Consumer<String> str = s -> System.out.println(s);

		str.accept("Venkateswarlu");
		str.accept("Male");
		str.accept("Madanapalle");
		
		
	}

}
