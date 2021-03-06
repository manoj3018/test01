package io.github.manoj.encapsulation;

// En Capsul ation - Restrict accessing the properties of a class to the outside world

// Encapsulation - Private properties + Getter & Setter Methods

public class Student {
	
	private String name;
	private int age;
	private String address;
	
	
	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	

}
