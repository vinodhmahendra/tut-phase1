package collections;

import java.util.HashMap;import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("cherry", 3);
		
		System.out.println("value of key banana : " + map.get("banana"));
		
		map.put("banana", 4);
		System.out.println("Updated map : " + map);
		
		map.remove("cherry");
		System.out.println("Updated map after removing cherry: " + map);
		
		for ( Map.Entry<String, Integer> entry:  map.entrySet() ) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " => " + value);
		}

		
	}

}
