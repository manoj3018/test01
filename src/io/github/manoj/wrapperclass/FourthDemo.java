package io.github.manoj.wrapperclass;

/**
 * 
 * @author A596009
 * AutoBoxing - Automatic conversion that Java makes between the primitive data type to corresponding object wrapper class
 *
 *
 */

public class FourthDemo {

	public static void main(String[] args) {
		
		//AutoBoxing - Java automatically converts int (primitive data type) to Integer object.
		int a = 100;
		Integer b = a;
		System.out.println("AutoBoxing" + b);
		
		// Manual Boxing
		int a1 = 200;
		Integer b1 = Integer.valueOf(a1);  // valueOf - Either int or Sting it will return Integer object
		System.out.println("Boxing" + b1);
		
		// Unboxing - Convert Object to primitive data type
		Integer result = 150;
		int newResult = result.intValue();
		System.out.println("Unboxing" + newResult);
		
		//AutoUnboxing
		Integer marks = 95;
		int newMarks = marks;
		System.out.println("AutoUnboxing" + newMarks);
		
		
	}

}


