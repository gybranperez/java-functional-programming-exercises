package mx.com.designPatterns;

import mx.com.designPatterns.model.Burger;
import mx.com.designPatterns.model.BurgerShop;

public class DecoratorDesignPattern {
	/*
		The Decorator design pattern is used to modify 
		functionality of object at runtime 
		without affecting other instances of the same class.
		
		Unlike Inheritance and Composition that are processed at compilation time
	*/
	public static void main(String[] args) {
		Burger myOrder = new BurgerShop(burger -> burger.addCheese()).use(new Burger());
		System.out.println("I get " + myOrder + "\n");

		Burger myOrder2 = new BurgerShop(burger -> burger.addVegies()).use(new Burger());
		System.out.println("I get " + myOrder2 + "\n");

		Burger myOrder3 = new BurgerShop(burger -> burger.addVegies()).use(myOrder);
		System.out.println("I get " + myOrder3);
		
		
		
	
	}
}
