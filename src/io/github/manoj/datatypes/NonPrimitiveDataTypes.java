package io.github.manoj.datatypes;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		
		//STRING
		String str = "test";
		System.out.println("String is : " + str);
		
		String str1 = new String("test");
		System.out.println("Another String is : " + str1);
		
		// ARRAY
		int[] arr;
		arr = new int[2];
		arr[0] = 0;
		arr[1] = 1;
		//arr[2] = 2;
		
		System.out.println(arr.toString());
		System.out.println(arr[0]);
		

	}

}
