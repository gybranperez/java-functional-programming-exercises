package mx.com.java8.functionalGenerics;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<String, String, String> biFunction = (a,b) -> a+" "+b;
		System.out.println(biFunction.apply("Gybran","Perez"));
	}

}