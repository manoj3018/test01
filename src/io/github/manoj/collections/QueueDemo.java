package io.github.manoj.collections;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 
 * @author A596009
 * Queue - FIFO
 *  > Queue has a concept of Head & Tail
 */

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<String>();
		
		queue.add("India");
		queue.add("Germany");
		queue.add("America");
		
		System.out.println("Original Queue :" + queue); // In this step it does not store elements based on the sorting. It will be a randon order when used in sysout
		
		// queue remove
		queue.remove();
		System.out.println("Queue after removing the head element :" + queue);
		
		// view top element
		String head = queue.peek();
		System.out.println("Head of the queue :" + head);
		
		// poll - use to remove as well as return the element
		head = queue.poll();
		System.out.println("Remove head: " + head);
		
		System.out.println("Queue now looks like: " + queue);
		
		
		

		
	}

}
