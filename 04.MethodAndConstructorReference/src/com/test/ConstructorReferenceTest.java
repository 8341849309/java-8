package com.test;

import com.beans.Sample;
import com.interf.ISampleInterf;

public class ConstructorReferenceTest {

	public static void main(String[] args) {

		ISampleInterf i = Sample :: new;
		
		// Used to create object
		Sample s1 = i.get("Ravi");
		Sample s2 = i.get("Ram");
		
	}

}
