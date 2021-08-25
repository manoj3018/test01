package io.github.manoj.recursion;

public class FactorialDemo {

	public static void main(String[] args) {

		ComplexFunction complexFunction = new ComplexFunction();
		
		int result= complexFunction.calculateFactorial(5);
		
		System.out.println("Factorial of 5: " + result);
		
		
//		calculateFactorial(5)
//		    calculateFactorial(4)
//		       calculateFactorial(3)
//		           calculateFactorial(2)
//		               calculateFactorial(1)
//							return 1
//						 return  2*1 = 2
//					 return 3*2 = 6
//				  return 4*6 = 24
//			   return 5*24 = 120
	}
	

}
