package com.interf;

public interface IDefaultMethods {

	default void m1() {
		System.out.println("IDefaultMethods.m1().....");
		System.out.println("Default no-arg and no-retutn type method");
	}
	
	default void m2(int a, int b) {
		System.out.println("IDefaultMethods.m2().....");
		System.out.println("Sum is:: "+a+b);
	}
	
	default String wish(String user ) {
		
		System.out.println("IDefaultMethods.wish().....");
		return "Good morning:: "+user;
	}
	
}
