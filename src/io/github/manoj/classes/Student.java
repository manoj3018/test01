package io.github.manoj.classes;

/**
 * 
 * @author A596009
 * Class - It is blueprint of object (or) It is a logical entity
 * Object - It is basically an instance of a class
 * 
 * Class contains - attributes/properties   &  behavior/methods
 * 
 * getters & setters usage - how you can add/modify values into Student class. For Ex: To insert name, age etc.
 *
 */

public class Student {
	
	String name;  // attributes
	int age;
	String address;
	
	// Constructor - Special type of method to initialize any class objects
	public Student(String name, int age, String address) {
		super();
		this.name = name;  // Current object name = argument name
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
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}


	public static void main(String[] args) {
		
		// Initialize the class
		
		Student john = new Student("John", 28, "Chitlapakkam");
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
		

		
	}

}
