package io.github.manoj.wrapperclass;

/**
 * 
 * @author A596009
 * All wrapper class present under java.lang package!
 * 
 * When to use?
 *   > While using Collection Framework
 *   > To convert primitive data type to objects and vice versa
 *   > Many libraries in java deals with objects and not with primitive data type
 *   
 *   Collection
 *   
 *   Correct way  -> List<Integer> newList = new ArrayList<Integer>();
 *   Wrong way    -> List<int> newList = new ArrayList<int>();
 * 
 *  Imp Note: All wrapper class are final (i.e) You cannot extend!
 */

public class FirstDemo {

	public static void main(String[] args) {
		
		int a = 50;
		System.out.println("Primitive :" + a);
		
		Integer a1 = 55;
		System.out.println("Wrapper :" + a1);
		
		

	}

}
