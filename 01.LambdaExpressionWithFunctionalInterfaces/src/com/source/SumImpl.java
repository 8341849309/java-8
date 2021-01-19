package com.source;

import com.interf.ISumInterf;

public class SumImpl {

	public static void main(String[] args) {
		
		
		// ISumInterf i = (a,b) -> a+b;
		
		ISumInterf i = (a,b) -> {
			return a+b;
		};
		
		System.out.println(i.add(10, 20));
	}

}
