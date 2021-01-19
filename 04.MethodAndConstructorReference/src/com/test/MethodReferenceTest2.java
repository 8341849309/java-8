package com.test;

public class MethodReferenceTest2 {

	public static void m1() {
		for(int i=0; i<5; i++) {
			System.out.println("Child Thread:: static");
		}
	}
	
	public static void main(String[] args) {
		
		Runnable r = MethodReferenceTest2 :: m1;
		Thread t = new Thread(r);
		
		t.start();
		for(int i=0; i<5; i++) {
			System.out.println("Main Thread");
		}
		
	}

}
