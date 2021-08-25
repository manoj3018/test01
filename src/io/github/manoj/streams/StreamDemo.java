package io.github.manoj.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 
 * @author A596009
 *  Streams - Iterate over Collection and to manipulate Collection
 *  
 *  Note: To convert a particular Collection into a Stream you need to call -> Collection type.stream()
 *  
 *  numbersList.stream() - Collection elements are streamed and not sent one by one
 *  
 *  Note: Whenever you want to change the representation of element inside a Collection think map method of the StreamAPI
 */

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> numbersList = new ArrayList<Integer>();
		
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);
		
		System.out.println("Total entries present in the ArrayList :" + numbersList);
		
		// Requirement: You need to calculate the square of each of the elements of the list and prepare new list
		
		List<Integer> squaresList = new ArrayList<Integer>();
		for(Integer i : numbersList) {
		squaresList.add(i*i);
		System.out.println(squaresList);
		}
		
		
		// For the above requirement using Streams
		// map method is used to change the representation of elements one by one
		List<Integer> squaresList1 = numbersList.stream().map(x -> x*x).collect(Collectors.toList());  
		System.out.println("List of squared numbers" + squaresList1);
		
		
		
		
		
		// Requirement : You have a list and you need to convert into a Set and while converting you should also calculate the
		//               square root of the number
		
		// If Stream is not an option
		
		Set<Integer> squareSet = new HashSet<Integer>();
		for(Integer i: numbersList) {
			squareSet.add(i*i);
		}
		
		System.out.println("Set of squared numbers :" + squareSet);
		
		
		// Using Stream API
		
		Set<Integer> squareSet1 = numbersList.stream().map(x -> x*x).collect(Collectors.toSet());
		System.out.println("Set of squared numbers :" + squareSet1);

		
		// Popular functionality of Stream : filtering
		// Task is :> Get a new list out of the existing list which will have the elements which start with the letter p 
		
		List<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("Python");
		languages.add("Scala");
		
		// The below code if not using Stream API
		
       List<String> latestList = new ArrayList<String>();
       for(String s:languages) {
    	   if(s.startsWith("P")) {
    		   latestList.add(s);
    	   }
    	}
       
       System.out.println("Languages starting with letter p :" + latestList);
       
      
       
       // Writing the same code using Stream API
       
       // note: when you want to write a conditional logic or filter for all the elements in List then you have use filter method!
       
      // List<String> latestList1 = languages.stream().map(p -> p.startsWith("P").collect(Collectors.toList()));
      //                          Converting list to Stream
       List<String> latestList1 = languages.stream().filter(s -> s.startsWith("P")).
    		                        collect(Collectors.toList());
       
       System.out.println("Languages starting with letter p :" + latestList1);
       
       
       
       
       // Sorting Collections using Stream API
       
       
		List<String> language = new ArrayList<String>();
		language.add("scala");
		language.add("java");
		language.add("python");
		language.add("basic");
		
		List<String> sortStream = language.stream().sorted().collect(Collectors.toList()); // Since this is String,Java is able to identify the natural sorting order. In case of our custom class we need to specify the customized sorting order
		System.out.println("The sorted Stream is: " + sortStream);
		
		// how to iterate over collections using the stream api : In Stream API we have forEach
		
		System.out.println("Printing each elements one by one:");
		
		language.stream().forEach(y -> System.out.println("element is: " + y));
		
		
		/**
		 * 
		 *  	Demonstration of Reduce Method!
		 *  
		 * Topic : Streams Reduce
		 * Requirement: Have a list of numbers and you are asked to calculate the sum(single result) of all the elements inside list
		 * You can use a complex forEach logic or enhanced for loop for the above requirement. We can use the same kind of logic using reduce method.
		 * 
		 * Note: Whenever you have to change the whole collection representation of complete collection into single result.
		 * In these cases you use reduce method in Stream API
		    
		 * 1) Identity : An element that is the initial value of the reduction operation and the default result if the stream is empty.
		 * 
		 * 2) Accumulator: A function that takes two parameters:
		 *    a partial result of the reduction operation & the next element of the stream
		 *    
		 *    (ans,i) - Function arguments
		 *    -> ans+i) - Implementation of accumulator function
		 * 
		 * 3) Combiner: A function that is used to combine the partial result of the reduction operation
		 *    When the reduction is parallelized , or when there is a mismatch between the types of the accumulator
		 *    arguments and the types of accumulator implementation
		 *    
		 *    combiner is mostly required when if both ans & i are of different data type. Since arguments of the accumulator function is of same data type combiner is not required
		 */
		
		
		
		int sum = numbersList.stream().reduce(0, (ans,i)-> ans+i);
		System.out.println("Sum of all the elements in the number list: " + sum);

		
		
		
		
       
       
       
       
			
		}
		
		
}
