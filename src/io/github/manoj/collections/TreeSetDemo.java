package io.github.manoj.collections;

import java.util.TreeSet;

/**
 * 
 * @author A596009
 * TreeSet - Main reason you want to use Tree Set is when you want to maintain  natural ordering of the elements 
 * This is not thread safe collection(i.e) It is not synchronized
 * Whenever you are using TreeSet in a multi-threaded environment you need to write more wiring code
 * TreeSet - No matter how many times you run , you will always get same order based on the sorting implementation available in the class type
 * 
 */

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("C");
		
		System.out.println(treeSet);
		
	}

}
