package com.test;

import com.interf.IDefaultMethods;
import com.interfImpl.DefaultMethodsImpl;

public class DefaultMethodsTest {

	public static void main(String[] args) {

		DefaultMethodsImpl d = new DefaultMethodsImpl();
		d.m1();
		System.out.println("---------------------");
		d.m2(10, 20);
		System.out.println("---------------------");
		
		//Impl class method is executed
		System.out.println(d.wish("Venkateswarlu"));
		
	}

}
