package io.github.manoj.collections;

import java.util.HashSet;

/**
 * 
 * @author A596009
 * HashSet - It is a random access element collection list. 
 * If you try to print the HashSet again & again you might get different order
 *
 */

public class HashSetDemo {
	
	public static void main (String[] args) {
		
		HashSet<String> hashset = new HashSet<String>();
		
		hashset.add("A");
		hashset.add("B");
		boolean r1 = hashset.add("C");
		System.out.println(r1);
		boolean r2 = hashset.add("C");
		System.out.println(r2);

		
		System.out.println("Initial Set :" +hashset);
		
		
		// contains method is used to check if a particular element in the Set exist or not
		
		System.out.println("Set contains C or not ? " + hashset.contains("C"));
		System.out.println("Set contains D or not ? " + hashset.contains("D"));
		
		hashset.remove("A");
		System.out.println("Set After removing A : " + hashset);
		
		// Enhanced ForLoop
		
		for(String item : hashset) {
			System.out.println(item);
		}
	}

}
