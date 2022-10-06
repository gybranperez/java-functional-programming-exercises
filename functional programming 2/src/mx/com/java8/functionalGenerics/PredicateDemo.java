package mx.com.java8.functionalGenerics;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateDemo {
	public static void main(String[] args) {
		// List<String> list = Arrays.asList("Gybran", "Juan", "Karla");
		List<String> list = Stream
				.of(	"Gybran Perez", 
						"Paty Juarez", 
						"Juan Perez","", 
						"Juan Hernandez", "", 
						"Karla Perez")
				.collect(Collectors.toList()); // Lista de ejemplo
		
		
		// creamos condicion de evaluacion
		Predicate<String> predicate = s -> !s.isEmpty();
		// filtramos la lista deacuerdo a la condicion y Mostramos la nueva lista 
		System.out.println(filterList(list, predicate));
		
		// Generamos una condicion
		Predicate<String> predicateContains = s -> s.contains("Perez");
		// filtramos la lista deacuerdo a la condicion y Mostramos la nueva lista
		System.out.println(filterList(list, predicateContains));
		
		
		
		// Ejemplo con otro tipo (Integer)
		List<Integer> integers = Stream.of(1,2,3,4,5,6,7,8)
									.collect(Collectors.toList());
		// Generamos una condicion
		Predicate<Integer> predicateIntegers = n -> n % 2==0;
		// filtramos la lista deacuerdo a la condicion y Mostramos la nueva lista
		System.out.println(filterList(integers, predicateIntegers));
		
	}

	private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
		return list.stream()
				.filter(s -> predicate.test(s))
				.collect(Collectors.toList());
	}
}
