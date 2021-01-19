package com.function;

import java.util.function.Function;

import com.beans.Student;

public class Function3 {

	public static void main(String[] args) {

		Student[] s = {
				
				new Student("Venkat", 70),
				new Student("Vishnu", 93),
				new Student("Madhu", 80),
		};
		
		
		Function<Student, Character> f = stu-> {
			
			char grade;
			
			if(stu.marks>90) 
				grade = 'A';
			else if(stu.marks<=90 && stu.marks>75)
				grade='B';
			else
				grade='C';
				
			
			return grade;
		};
		
		
		for(Student s1 : s) {
			System.out.println("Name ::"+s1.name);
			System.out.println("Marks ::"+s1.marks);
			System.out.println("Grade ::"+f.apply(s1));
			System.out.println("----------------------");
		}
		
		
	}

}
