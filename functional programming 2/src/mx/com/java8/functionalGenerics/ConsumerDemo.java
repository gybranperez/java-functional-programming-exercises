package mx.com.java8.functionalGenerics;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsumerDemo {

	public static void main(String[] args) {
		// Ejemplo basico
		Consumer<String> greetPerson = name -> System.out.println("Bienvenido " + name);
		greetPerson.accept("Gybran");
		
		// Ejemplo con lista
		List<Integer> list = Stream
					.of(1,2,543,2345,213,12,987,43)
					.collect(Collectors.toList());
		// El consumer toma el valor y lo imprime
		Consumer<Integer> consumer = n -> System.out.println(n);
		printElements(list , consumer);
	}

	private static <T> void printElements(List<T> list, Consumer<T> consumer) {
		list.forEach(e -> consumer.accept(e));		
	}

}
