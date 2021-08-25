package io.github.manoj.innerclass;

public class OuterClass {
	
	// a) Normal Inner Class
	class InnerClass{
		void display() {
			System.out.println("This is Inner class method");
		}
	}
	
	// b) Method Local Inner Class - Trying to create a class inside the method of outer class
	
	void outerClassMethod() { // normal instance method
		
		System.out.println("In the outer class method");
	
		
		// The whole below logic can be embedded inside a method
		class MethodLocalClass {
			void localInnerMethod() {
				System.out.println("In the Method local class: Method");
			}
		}
		
		// Once after defining the class then within the method we can also initialize the class if I want.
		MethodLocalClass mlc = new MethodLocalClass();
		mlc.localInnerMethod();
			
		
		
		
	}
	
	

}
