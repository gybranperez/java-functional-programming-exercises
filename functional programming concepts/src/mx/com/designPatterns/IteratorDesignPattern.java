package mx.com.designPatterns;

import mx.com.designPatterns.model.MyArrayList;

public class IteratorDesignPattern {
	/*
	 * A behavioral design pattern which focuses on how objects interact with each other
	 *
	 * The iterator design pattern, enables to get a way to access the elements of a 
	 * collection object in sequential manner without any need to know its internal representation.
	 * Examples of this pattern are: 
	 * 
	 * 			java.util.Iterator 
	 * 			java.util.Enumeration 
	 * 
	 * Consist in accessing the elements of the container WITHOUT exposing the 
	 * internal structure of the object, for example:
	 * 
	 * if we use a for loop we can see how the object is accessed
	 * 			for(int i = 0; i<10; i++){ ... }
	 * 
	 * whereas with iterator we don't expose the internal representation of the 
	 * object we are traversing. Like it doesn't matter if it's a 
	 * 			List<String> l = new ArrayList<>(); 
	 * or a 
	 * 			Set<String> s = new HashSet<>();
	 * it can be iterated in the same way with its corresponding iterator
	*/
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(new Object[] {1,2,3,45});
		list.forEach(System.out::println);
	}

}
