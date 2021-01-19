package com.beans;

public class Employee {

	public Float salary;
	public String name;
	
	public Employee(String name, Float salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}
	
}
