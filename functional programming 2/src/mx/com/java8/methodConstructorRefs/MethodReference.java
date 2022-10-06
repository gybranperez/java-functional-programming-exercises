package mx.com.java8.methodConstructorRefs;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Casos de Referencias por metodo
 * 
 *  1. Method Reference a un método de instancia de un objeto existente
 *  	objeto :: metodoDeDichaInstancia	
 *  2. Method Reference a un método estático de una clase
 *  	Clase :: metodoEstatico
 *  3. Referencia a un metodo de instancia de un objeto pasado como
 *  	parametro de un tipo en particular
 *  	Clase :: metodoDeInstancia 
 *  4. Referencia al constructor de clase
 *  	Clase :: new
*/
public class MethodReference {
	public static void main(String[] args) {

		List<Integer> list = Stream
					.of(1,2,543,2345,213,12,987,43)
					.collect(Collectors.toList());

		/* Ejemplos caso 1
		 * Sabemos que la lambda de tipo consumer solo acepta 1 valor...
		   y que usaremos la instancia de System.out (Objeto existente) cada vez que sea llamado
		   nuestro consumer, por lo que podemos referenciar al metodo println (Metodo de instancia)
		*/
		Consumer<Integer> consumer = System.out :: println;
		list.forEach(e -> consumer.accept(e));
		/*
		  Sabemos que SUPPLIER no recibe valores... pero regresa algo
		  en nuestro caso un numero decimal random donde Math es la clase y random un
		  metodo estatico 
		*/
		Supplier<Double> randomNumber = Math::random;
		System.out.println(randomNumber.get());
		
	}
}
