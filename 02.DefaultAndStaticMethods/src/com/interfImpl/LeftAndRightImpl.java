package com.interfImpl;

import com.interf.Left;
import com.interf.Right;

public class LeftAndRightImpl implements Left,Right {

	/*
	 * Calling Left Interface m1() and
	 * Calling Right Interface m2()
	 */
	public void m1() {
		Left.super.m1();
		Right.super.m1();
	}
	
	
}
