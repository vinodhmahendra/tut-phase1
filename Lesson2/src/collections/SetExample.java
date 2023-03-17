package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("cherry");
		set.add("durian");
		
		set.add("cherry"); // duplicate is not added
		System.out.println(set);
		
		
		set.remove("banana");
		
		for (String element : set) {
			System.out.println(element);
		}

	}

}
