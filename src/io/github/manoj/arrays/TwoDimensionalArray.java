package io.github.manoj.arrays;

/**
 * 
 * @author A596009
 * Generally we need to use 2d arrays if there is any matrix operation.
 * Technically the 2D array will hold 2D matrix
 *
 */

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
	
	int[][] twod_array = {{1,2,3},{4,5,6},{7,8,9}};
	
	for (int i=0; i<=2; i++) { // This for condition to loop through all rows
		for (int j=0; j<=2; j++) { // This for condition to loop through all elements of current row
			System.out.print(twod_array[i][j] + " ");
		}
		System.out.println();
		}
		System.out.println(twod_array[0][2]);
	}
}