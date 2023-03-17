package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("durian");
		
//		list.add(1); // compiler error
		
		System.out.println("First Element: " + list.get(0));
		System.out.println("Third Element: " + list.get(2));
		
		list.set(1, "blueberry");
		System.out.println("updated list : " +list);
		
		list.remove(3);
		System.out.println("Updated list after removing an element : " + list);
		
		Iterator<String> i = list.iterator();
		while ( i.hasNext() ) {
			System.out.println(i.next());
		}
		
		System.out.println("For Each Loop -->");
		
		for (String element: list) {
			System.out.println(element);
		}
	}

}
