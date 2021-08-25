package io.github.manoj.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> hashmap = new HashMap<>();
		
		hashmap.put("A", 10);
		hashmap.put("B", 20);
		hashmap.put("C", 30);
		
		System.out.println("The Map size is :" + hashmap.size());
		
		System.out.println(hashmap);
		
		// Checking if a particular key is present in hashmap and getting the corresponding value
		
		if(hashmap.containsKey("A")) {
			Integer hm = hashmap.get("A");
			System.out.println("Value for Key " + "\"A\" is :" + hm);
		}
		
		// When you want to iterate through all the keys : Can be achieved using Enhanced forLoop
		// hashmap.get(key) -> Provide the key and get the value
		// If you want to know the keySet
		for(String key: hashmap.keySet()) {
			System.out.println("key: "+ key+", value: "+ hashmap.get(key));
		}
		
		// If you aware of the KeySet since it contains Key as String and Value as Integer
		for(Entry<String, Integer> entry: hashmap.entrySet()) {
			System.out.println("key - " + entry.getKey() + ", value: " + entry.getValue());
			
		}
	}
}
