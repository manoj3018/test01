package io.github.manoj.comparable;

public class Student implements Comparable<Student> {
	
	private int rollNumber;
	private String name;
	private int age;
	
	
	
	public Student(int rollNumber, String name, int age) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age= age;
	}
	
	

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}


	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Custom logic sorting
	@Override
	public int compareTo(Student student) {
		return this.rollNumber - student.rollNumber;
	}
	
	
}
