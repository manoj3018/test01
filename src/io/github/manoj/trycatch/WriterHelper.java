package io.github.manoj.trycatch;

import java.util.ArrayList;
import java.util.List;

public class WriterHelper {
	
	public void writeList() {
		
		try {
			
			List<Integer> list = new ArrayList<Integer>(10);
			list.add(10); // Adding 10 at index 0 but we are accessing list elements in index 1 which gets an error AIOB Exception
			
			System.out.println("Entering try statement");
			Integer a = list.get(1);
			System.out.println("Accessing the first element: " +a);
		}
		catch(IndexOutOfBoundsException e) {
			System.err.println("Caught IndexOutOfBoundsException " + e.getMessage());
		}
		finally {
			System.out.println("This will always be executed");
		}
	}
	
	

}
