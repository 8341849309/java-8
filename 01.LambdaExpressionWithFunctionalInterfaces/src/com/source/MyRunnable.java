package com.source;

public class MyRunnable {

	public static void main(String[] args) {
		
		/*
		 * Implementation of Runnable(I) is directly provided without taking another class 
		 * that implements Runnable(I)
		 */
		Runnable r = () -> {
			
			for(int i=0; i<5; i++) {
				System.out.println("My Thread:: "+i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("Main Thread:: "+i);
		}
		
		
	}
}
