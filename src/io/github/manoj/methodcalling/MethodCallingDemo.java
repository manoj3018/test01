package io.github.manoj.methodcalling;

/**
 * In this demo we will see the anatomy of method calling and how do we pass arguments
 * 
 * Important Note: The return statement will be last execution step of the method
 * 
 * Basic need for writing a method?
 *  - Not do the same thing again and again at every place
 *  
 *  Pass by value -> int i = 1; > A copy of particular variable is passed to the method argument > changeValue(i) 
 *  We are not passing the same reference value instead we are passing a reference of it.
 *
 */

public class MethodCallingDemo {

	public static void main(String[] args) {
		
		int i = 1;
		changeValue(i); // It's not the same reference which is being passed // calling a method which is named as changeValue
		System.out.println("i is: "+ i);  // The new value of i should be 2 but still the output is 1. Because it is happening due to pass by value
		
		Student s = new Student("Manoj", 28, "Chennai");
		//changeNameInSameObject(s);
		Student resultObj = changeNameInDiffObject(s);
		System.out.println(resultObj.getName());
		//System.out.println(s.getName());
		System.out.println(s.getAddress());
		System.out.println(s.getAge())
		
		//System.out.println(s.getName());
;
		
			

	}

	private static void changeValue(int i) {
          i = i + 1;		
	}
	
	static void changeNameInSameObject(Student s) {
		s.setName("Kumar");
	}
	
	
	static Student changeNameInDiffObject(Student s) {
		Student newStudent = new Student("Jane", s.getAge(), s.getAddress());
		return newStudent;
	}
	
	




}
