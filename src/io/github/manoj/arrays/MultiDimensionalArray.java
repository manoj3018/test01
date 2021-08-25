package io.github.manoj.arrays;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		
		/**                              0                        1
		 * First Dimension - {   { {1,2,3},{4,5,6} } , { {7,8,9},{10,11,12} }    } - X
		 * 
		 *                         0         1
		 * Second Dimension - { {1,2,3} , {4,5,6} } - Y
		 * 
		 *                    0 1 2
		 * Third Dimension - {4,5,6} - Z
		 * 
		 * 1 - x of 0  | 4 - x of 1  
		 * 2 - y of 0  | 5 - y 0f 1
		 * 3 - z of 0  | 6 - z of 1
		 * 
		 */
		int[][][] threed_array = {  { {1,2,3},{4,5,6} } , { {7,8,9},{10,11,12} }  };
		
		System.out.println(threed_array[0][1][2]); // 6 | 0 - x position ; 1 - y position ; 2 - z position
		System.out.println(threed_array[1][0][2]); // 9 | 1 - x position ; 0 - y position ; 2 - z position
	}

}
