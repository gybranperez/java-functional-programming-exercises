package mx.com.java8.functionalGenerics;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		//basicamente lo mismo que BiFunction pero con el mismo tipo de dato...
		// es decir, recibe 2 parametros del mismo tipo, y devuelve
		// 1 de ese mismo
		BinaryOperator<String> operator = (a,b) -> a+"."+b;
		System.out.println(operator.apply("basicsstrong", "com"));
	}

}
