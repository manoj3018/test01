package io.github.manoj.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		Student john = new Student(3, "John", 21);
		Student jane = new Student(1, "Jane", 18);
		Student tom = new Student(2, "Tom", 20);
		
		list.add(john);
		list.add(jane);
		list.add(tom);
		
		Collections.sort(list);
		
		System.out.println("Students after sorting: ");
		list.forEach(student -> System.out.println(student.getName()));   // Jane, Tom, John
		
		
		
	}

}
