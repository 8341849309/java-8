package com.test;

import com.interf.ISumInterf;

public class MetodReferenceTest3 {

	public int sum(int a, int b) {
		
		return a+b;
	}
	
	public static void main(String[] args) {

		/*
		 * Though return types are not matched we can refer
		 */
		ISumInterf i = new MetodReferenceTest3() :: sum;
		
		i.add(10, 20);
		
		// OR
		
		ISumInterf is = (a,b) -> System.out.println("Sum is:: "+(a+b));
		is.add(10, 30);
		
	}

}
