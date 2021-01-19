package com.consumer;

import java.util.function.Consumer;
import java.util.function.Function;

import com.beans.Student;

public class Consumer2 {

	public static void main(String[] args) {

		Student[] st = {

				new Student("Venkat", 70), 
				new Student("Vishnu", 93), 
				new Student("Madhu", 80), 
		};

		Function<Student, Character> f = stu -> {

			char grade;

			if (stu.marks > 90)
				grade = 'A';
			else if (stu.marks <= 90 && stu.marks > 75)
				grade = 'B';
			else
				grade = 'C';

			return grade;
		};
		
		
		// Takes the given object and prints it
		Consumer<Student> student = s -> {
			System.out.println("Name ::" + s.name);
			System.out.println("Marks ::" + s.marks);
			System.out.println("Grade ::" + f.apply(s));
			System.out.println("----------------------");
		};

		for (Student s1 : st) {
			student.accept(s1);
		}

	}

}
