package io.github.manoj.staticdemo;

/**
 * 
 * static variables - static String college = "XYZ";
 * 
 * Static methods - Will be used in Counting the Employee number scenario
 * 
 * Static Block - If you have a block of code that you need to execute only once when the class is loaded into the run time then you can use static block
 *
 */

public class Student {
	
	static {
		System.out.println("Initializer code!");
		// Inside static block will be able to access only static variable
	}
	
	String name;
	int age;
	String address;
	static String college = "XYZ"; // Hardcoded string value  // Everytime you create student object this variable is getting initialized unecessarily eventhough the value is fixed. So we make this value as Static
	static int count = 0;
	
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

	public String getCollege() {
		return college;
	}
	
	static void studentCount() {
		count = count+1;
	}
	
	// A non static method can access the static variable - Reverse is applicable
	int getCount() {
		return count;
	}

	

}
