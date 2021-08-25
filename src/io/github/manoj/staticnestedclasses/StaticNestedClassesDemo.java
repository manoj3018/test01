package io.github.manoj.staticnestedclasses;

public class StaticNestedClassesDemo {
	
	public static void main(String[] args) {
		
		// Accessing a static nested class
		// If you want to access or initialize we need to follow the below construct
		OuterClass.staticNestedClass nestedobj = new OuterClass.staticNestedClass();
	    
		nestedobj.display();
	}

}
