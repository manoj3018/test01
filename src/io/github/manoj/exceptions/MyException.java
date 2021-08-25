package io.github.manoj.exceptions;

/**
 * 
 *  Whenever we are creating custom exception, by default it is checked Exception
 *
 */

@SuppressWarnings("serial")
public class MyException extends Exception {  // To create our own custom exception
	
	// default constructor
	MyException(){
		
	}
	
	//parameterized constructor
	MyException(String str) {
		super(str);
		}

}
