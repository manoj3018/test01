package io.github.manoj.datatypeconversion;

/**
 * 
 *  byte > short >  int > long > float > double > boolean > character
 *  
 *  Basic principle: Smaller box can fit into larger box (Implicit)
 *  
 *                   If we have to store a larger range variable into a smaller range variable then you have to
 *                   sacrifice some quality of the value
 *
 */

public class ImplicitDataTypeConversion {
	
	public static void main(String[] args) {
		
		int a = 100;
		System.out.println("Int representation: " +a);
		
		
		long b = a;
		System.out.println("Long representation: "+b);
		
		float c = b;
		System.out.println("Float representation: "+c);
	}
	
	

}
