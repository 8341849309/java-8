package com.source;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.beans.Employee;

public class EmployeeComparator {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(846736, "Venkat"));
		al.add(new Employee(846737, "Siva Reddy"));
		al.add( new Employee(846726, "Kowshil"));

		System.out.println(al);
		
		Collections.sort(al, (e1,e2) -> (e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0 );
		
		System.out.println(al);
	}

}
