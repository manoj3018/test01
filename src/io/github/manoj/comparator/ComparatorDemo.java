package io.github.manoj.comparator;

import java.util.ArrayList;
import java.util.Collections;

import io.github.manoj.comparable.Student;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		Student john = new Student(3, "John", 18);
		Student jane = new Student(1, "Jane", 21);
		Student tom = new Student(2, "Tom", 20);
		
		list.add(john);
		list.add(jane);
		list.add(tom);
		
		Collections.sort(list);
		System.out.println("Students after sorting: ");
		list.forEach(student -> System.out.println(student.getName()));   // Jane, Tom, John
		
		
		Collections.sort(list, new AgeComparator());
		System.out.println("Students after AGE sorting: ");
		list.forEach(student -> System.out.println(student.getName()));
		
		
	}

}
