package io.github.manoj.methodcalling;

public class Student {
	
	String name;
	int age;
	String address;
	
	
	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}


	public String getName() {  // We have the flexibility to change the modifier
		return name;
	}
	
//	public String getName() {
//		
//		
//		
//		int i = 1;
//		String returnVar = null;
//		if(i == 1) {
//			returnVar = "test";
//		} else {
//			returnVar = name;
//		}
//			return returnVar;
//		}  
		



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
