package io.github.manoj.recursion;

/**
 * 
 * Whatever you can achieve with recursion, generally you can achieve the same output using for loop
 * but in for loop it requires to write lot of code. Recursion reduces the code 
 * 
 * 
 * Important Note: Whatever you define inside your method(variables, statements etc..) they go onto the stack.
 * Practice more about recursion
 * 
 */

// Example of recursion with the help of use case called factorial.
// Factorial of 10 = 10*9*8*7*6*5*4*3*2*1
public class ComplexFunction {
	
	int calculateFactorial(int n) {
	if (n==1) {
	  return 1;	
	}
	else {
		return (n* calculateFactorial(n-1));
	}
	}
	
}
