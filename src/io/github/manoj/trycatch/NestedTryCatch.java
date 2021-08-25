package io.github.manoj.trycatch;

public class NestedTryCatch {
	
	public static void main(String[] args) {
		
		try { // block 1
			try { // block 2
				try { // block 3
					int[] arr = {1,2,3,4};
					
					System.out.println(arr[10]);
					
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("ArrayIndexOutOfBounds Exception in block 3 ");
					throw e; // re-throwing exception to enclosing try block
				}
			
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBounds Exception in block 2 ");
				throw e;
				
				}
			
			}
			catch (ArrayIndexOutOfBoundsException e4) {
					System.out.println("ArrayIndexOutOfBounds Exception in block 1 ");
					
				}
			
	
	}
	
}
