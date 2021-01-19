package com.beans;

public class Employee {

	public int eno;
	public String ename;

	public Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}

}
