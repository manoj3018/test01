package io.github.manoj.loops;

/**
 * 
 * @author A596009
 * 
 * Whenever you have a scenario where you need to iterate over a collection based on certain value of 
 * another collection then you can use nested for loops 
 *
 */

public class NestedForLoop {
	
	public static void main(String[] args) {
		
	int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
	
	for (int i=0; i<3; i++) { // This for condition to loop through all rows
		for (int j=0; j<3; j++) { // This for condition to loop through all elements of current row
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
		}
		
	}

}
