package io.github.manoj.staticdemo;

public class StaticDemo {

	public static void main(String[] args) {

		Student john = new Student("John" , 28, "23 East, California");
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
		System.out.println(Student.college);
		
	}

}
