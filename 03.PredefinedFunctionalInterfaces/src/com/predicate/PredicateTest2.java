package com.predicate;

import java.util.function.Predicate;

import com.beans.Employee;

public class PredicateTest2 {

	public static void main(String[] args) {

		// To check employee salary greater than 20,000
		Predicate<Employee> p1 = e ->e.salary>20000;

		System.out.println(p1.test(new Employee("Venkateswarlu", 21909f))); // true
		System.out.println(p1.test(new Employee("Madhu", 18909f))); // false
		
		// To check employee name lenght is greater than 10 char
		Predicate<Employee> p2 = e -> e.name.length()>10;
		
		System.out.println(p2.test(new Employee("Venkateswarlu", 21909f))); // true
		System.out.println(p2.test(new Employee("Madhu", 18909f))); // false
		
	}

}
