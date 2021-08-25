package io.github.manoj.loops;

/**
 * 
 * @author A596009
 * 
 * We generally use EnhancedForloop for scenarios whenever we want to iterate through collection of items or array of items
 * for(int item :numbers)
 * 
 * Left side corner(item)  - Representation of member of the collection. It can be anything
 * Right side corner(numbers) - Specify the collection variable which is holding
 *
 */
public class EnhancedForLoop {
	
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		for(int item :numbers) { // Specify the collection in the right most corner . Collection can be a list, Array, Map etc
			System.out.println("Count is :"+ item);
		}
	}
	

	
}
