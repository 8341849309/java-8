package com.test;

public class MethodReferenceTest1 {

	public void m1() {
		for(int i=0; i<5; i++) {
			System.out.println("Child Thread:: instance");
		}
	}
	
	public static void main(String[] args) {
		
		Runnable r = new MethodReferenceTest1() :: m1;
		Thread t = new Thread(r);
		
		t.start();
		for(int i=0; i<5; i++) {
			System.out.println("Main Thread");
		}
		
	}

}
