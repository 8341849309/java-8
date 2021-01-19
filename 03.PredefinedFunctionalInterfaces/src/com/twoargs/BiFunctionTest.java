package com.twoargs;

import java.util.ArrayList;
import java.util.function.BiFunction;

import com.beans.Employee;

public class BiFunctionTest {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		BiFunction<String, Float, ArrayList<Employee>> f = (name,salary) -> {
			
			al.add(new Employee(name, salary));
			
			return al; 
		};
		
		
		f.apply("Venkateswarlu", 21909f);
		f.apply("Manju", 30000f);
		f.apply("Vishnu", 40000f);
		
		System.out.println(al);
	}

}
