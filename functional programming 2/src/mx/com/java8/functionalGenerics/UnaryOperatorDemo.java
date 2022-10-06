package mx.com.java8.functionalGenerics;

import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnaryOperatorDemo {
	public static void main(String[] args) {
		
		// Ejemplo con lista
		List<Integer> list = Stream
					.of(1,2,543,235,213,12,987,43)
					.collect(Collectors.toList());
		
		UnaryOperator<Integer> operator = i -> i*(int)(Math.random()*100);
		
		System.out.println(mapper(list, operator));
	}

	private static <T> List<T> mapper(List<T> list, UnaryOperator<T> operator) {
		return list.stream()
				.map(n -> operator.apply(n))
				.collect(Collectors.toList());
	}
}
