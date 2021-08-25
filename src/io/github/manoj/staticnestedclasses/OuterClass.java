package io.github.manoj.staticnestedclasses;

/**
 * 
 * Point:
 * 1) Can access the normal static variable of the outer class and also the private static variable of the outer class inside a static nested class
 *
 *
 */

public class OuterClass {
	
	static int outerStaticMember = 10; // Normal static variable
	
	int instanceMember = 20; // normal instance variable
	
	private static int outerPrivateMember = 30; // private static outer variable
	
	
	// How to access the above variables inside the static nested class
	
	static class staticNestedClass {
		
		void display() {
			System.out.println("Static member of outer class: " + outerStaticMember);
			
			System.out.println("Private static member of Outer class: " + outerPrivateMember);
			
			//System.out.println("Non static member of Outer class: " + instanceMember); // Compilation error since we are trying to access a non static member inside a static class
		}
	}
	
	

}
