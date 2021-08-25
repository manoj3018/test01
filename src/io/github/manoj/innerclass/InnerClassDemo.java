package io.github.manoj.innerclass;

/**
 * 
 *  Classes used -> OuterClass
 *
 */

public class InnerClassDemo {

	public static void main(String[] args) {
		
		// To initialize a normal inner class
		OuterClass.InnerClass in = new OuterClass().new InnerClass(); // via the instance and not the class name
		in.display();
		
		// To invoke  outerClassMethod() we can initialize OuterClass class
		
		OuterClass outerClass = new OuterClass();
		outerClass.outerClassMethod();
		
		
		
		
	
		
	}

}
