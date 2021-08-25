package io.github.manoj.equalshashcode;

/**
 * 
 * Multiple objects can point the same memory location
 * 
 *  Note: It is always recommended override hashcode and equals 
 *
 */

public class Student {
	
	private int rollNo;
	private String name;
	private String address;
	
	public Student(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	// Overriding equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
			
		if (obj == null || obj.getClass() != this.getClass()) // obj of class type Student or not 
			return false;
		
			
		Student student = (Student)obj;
		
		return (student.rollNo == this.rollNo);
		
	}
	
	public int hashCode() {
		return this.rollNo;
	}
	
	
	
	
}
