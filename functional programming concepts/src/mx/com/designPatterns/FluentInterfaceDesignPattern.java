package mx.com.designPatterns;

import mx.com.designPatterns.model.Order;

public class FluentInterfaceDesignPattern {
	/*
		A fluent interface provides an easy-readable, flowing interface, 
		that often mimics a domain specific language. 
		
		Using this pattern results in code that can actually be read 
		nearly as human language. 
	*/
	public static void main(String[] args) {
		
		/*
		Order myOrder = new Order();
		myOrder.add("Shoes");
		myOrder.add("Teeth Brush");
		myOrder.add("Fries");
		myOrder.deliverAt("san joaquin 543");
		myOrder.place();
		*/
		new Order()
				.add("Shoes")
				.add("Teeth Brush")
				.add("Fries")
				.deliverAt("san joaquin 543")
				.place();
		
	}
}
