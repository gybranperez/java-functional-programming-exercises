package mx.com.java8.functionalGenerics;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<String> stringSupplier = () -> "A string";
		System.out.println(stringSupplier.get());
		
		Supplier<Double> randomNumber = () -> Math.random()*10;
		System.out.println(randomNumber.get());
		
	}

}
