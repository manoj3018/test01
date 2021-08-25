package io.github.manoj.loops;

/**
 * 
 * @author A596009
 * 
 * If you have a use case where before evaluating the condition you want to print something use Dowhile loop
 * Ex: In the below example if you want to print the initial value of count even before the condition checks
 * 
 * 
 * Whenever you want to write some pre-processing logic even before checking the very first condition of loop
 * then in that case you will use dowhile loop.
 * 
 *
 */

public class DoWhileDemo {
	
	public static void main(String[] args) {
	
	int count = 9;
	
	do {
		System.out.println("Count is:" + count);
		count++;
	} while (count<=10);  // Here in this do while the condition will be evaluated with count value 2
	
	}
	
}
