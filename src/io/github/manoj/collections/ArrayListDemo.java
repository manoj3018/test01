package io.github.manoj.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<Integer>(5);
		
		for(int i=1;i<=5;i++) {
			arrayList.add(i);
		}
		
		// Printing the elements
		System.out.println(arrayList);
		
		// Printing the element at index 3
		arrayList.remove(3);
		
		// Displaying the ArrayList after deletion
		System.out.println(arrayList);
		arrayList.size();
		
		// Printing the elements one by one
		for(int i =0; i< arrayList.size(); i++) {
			System.out.print(arrayList.get(i) +" ");
		}
		
		// displaying the same using enhanced forloop
		for(int al:arrayList) {
			System.out.print(al+" ");
		}
		
		
	}

}
