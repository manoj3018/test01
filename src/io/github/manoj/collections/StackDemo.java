package io.github.manoj.collections;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		// Stack - LIFO
		Stack<String> stack = new Stack<String>();
		
		stack.push("America");
		stack.push("Germany");
		stack.push("India");
		
		System.out.println("Original Stack :" + stack);
		
		String poppedElement = stack.pop();
		System.out.println("Popped Element :" + poppedElement);
		
		System.out.println("Now the Stack looks like :" + stack);
		
		// To just view the Top element in Stack
		
		String viewElement = stack.peek();
		System.out.println("View Stack :" + viewElement);
	}

}
