package com.source;

import com.interf.InterfArgs;

public class TwoArgs {

	public static void main(String[] args) {
		
		InterfArgs ia = (name, wish) -> {
			
			System.out.println(wish+":: "+name);
		};
		
		ia.wish("Venkateswarlu", "GoodMorning");
		
	}
	
}
