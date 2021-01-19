package com.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.beans.Employee;

public class PredicateTest3 {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Durga", 1001f));
		al.add(new Employee("Ravi", 2002f));
		al.add(new Employee("Siva", 3003f));
		al.add(new Employee("Mahesh", 4004f));
		al.add(new Employee("Ram", 5005f));
		
		
		// To print even salary employees
		Predicate<Employee> p = e -> e.salary%2==0;
		
		for(Employee e : al) {
			
			if(p.test(e))
				System.out.println(e);
			
		}
		
	}

}
