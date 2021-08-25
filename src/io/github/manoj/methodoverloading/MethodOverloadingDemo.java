package io.github.manoj.methodoverloading;

/**
 * 
 * Whenever method overloading is happening, technically Polymorphism is being applied on a method.
 * 
 *		 Overloading Method Constraints:
 * > Method name is going to remain the same.
 * > Return type of a overloaded methods can change
 * > The number of arguments and the type of arguments can change
 * 
 * Caution : Generally avoid Method overloading since it becomes complex
 */

public class MethodOverloadingDemo {
	
	public int multiply(int x, int y) {
		return (x*y);
	}
	
	public int multiply(int x, int y, int z) {
		return (x*y*z);
	}
	
	public double multiply(double x, double y) {
		return (x*y);
	}
	
	public static void main(String[] args) {
		
		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		System.out.println(demo.multiply(10, 20));
		System.out.println(demo.multiply(10, 20, 30));
		System.out.println(demo.multiply(10.5, 20.5));
		
		
	}

}
