package com.source;

import com.interf.Interf;

public class NoArgs {

	
	public static void main(String[] args) {
		
		/*
		Interf i = ()-> {
			System.out.println("Hello World!!!");
		};
		
		*/
		
		Interf i = () -> System.out.println("Hello World!!!");

		i.hello();
		
	}
	
}
