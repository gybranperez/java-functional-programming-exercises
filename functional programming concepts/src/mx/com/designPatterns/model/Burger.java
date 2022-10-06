package mx.com.designPatterns.model;

public class Burger {
	private String burgerType;

	public Burger(String burgerType) { this.burgerType = burgerType; }
	public Burger() { this.burgerType = ""; }

	public Burger addVegies() {
		System.out.println("Adding vegies to the burger");
		return new Burger(this.burgerType += " Vegie");
	}
	
	public Burger addCheese() {
		System.out.println("Adding cheese to the burger");
		return new Burger(this.burgerType += " Cheese");
	}

	public String getBurgerType() {
		return burgerType;
	}

	public void setBurgerType(String burgerType) {
		this.burgerType = burgerType;
	}

	@Override
	public String toString() {
		return String.format("%s", this.burgerType.trim() + " burger");
	}
	
}
