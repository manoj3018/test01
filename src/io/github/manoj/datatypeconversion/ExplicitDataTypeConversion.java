package io.github.manoj.datatypeconversion;

/**
 * 
 * byte > short >  int > long > float > double > boolean > character
 *
 */

public class ExplicitDataTypeConversion {
	
	public static void main(String[] args) {
		
		double a = 50.5;
		System.out.println("Double representation :" +a);
		
		float f = (float) a;
		System.out.println("Float representation :" +f);
		
		long b = (long) a;
		System.out.println("Long representation :" +b);
		
		int c = (int) b;
		System.out.println("Int representation :" +c);
		
	}
	
	

}
