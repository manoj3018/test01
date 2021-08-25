package io.github.manoj.collections;



import java.util.TreeMap;

/**
 * 
 * @author A596009
 * TreeMap - Main property::> When you enter elements into map it will be naturally sorted (If you put keys as Integer 
 * then TreeMap will automatically sort all the map entries in a Integer sorted fashion where you will see the natural number
 * sorting behavior like 1,2,3 and so on, If alphabets it will be A,B,C etc
 * Since the above class like (String, Integer, Double etc) are datatypes which Java is already aware
 * 
 * In case of Custom class -> We need to use Comparator & Comparable Interface  for customized sorting
 * 
 */
public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		// Did natural order sorting in the  Keys
		treeMap.put(3, "A");
		treeMap.put(2, "B");
		treeMap.put(1, "C");
		
		System.out.println(treeMap); // {1=C, 2=B, 3=A}
		
//		HashMap<Integer, String> hashMap = new HashMap<>();
//		
//		hashMap.put(3, "A");
//		hashMap.put(2, "B");
//		hashMap.put(1, "C");	
//		
//		System.out.println(hashMap);  // {1=C, 2=B, 3=A}

		
	}

}
