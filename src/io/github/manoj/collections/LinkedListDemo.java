package io.github.manoj.collections;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		// In this LinkedList concrete class is used in the LHS since some we are using some 
		// concrete methods that are available only in the LinkedList class and not in List Interface
		LinkedList<String> list = new LinkedList<String>(); 
		
		list.add("A");
		list.add("B");
		System.out.println(list);
		
		list.addLast("C");
		System.out.println(list);
		
		list.addFirst("D");
		System.out.println(list);
		
		
		list.add(2, "E");
		System.out.println(list);
		
		list.remove("B");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		
		
		
		
	}

}
