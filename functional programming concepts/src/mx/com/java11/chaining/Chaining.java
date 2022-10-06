package mx.com.java11.chaining;

import java.util.function.Function;

public class Chaining {

	public static void main(String[] args) {
		
		Consumer<String> c1 = s -> System.out.println(s);
		Consumer<String> c2 = s -> System.out.println(s);
		
//		c1.accept("hello 1");
//		c2.accept("hello 2");
		
//		Consumer<String> c3 = s -> {
//			c1.accept(s);
//			c2.accept(s);
//		};
//		c3.accept("Hello 3");
		
		Consumer<String> c4 = c1.thenAccept(c2);
		c4.accept("Hola 4");
		/*
		 * De la misma forma que hemos manufacturado nuestro metodo , las Interfaces FUncionales
		 * tienen su propia implementacion de metodos en cadena 
		 * */
		Function<Integer, Integer> f1 = s -> s+2;
		Function<Integer, Integer> f2 = s -> s*2;
		/*
		default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
	        Objects.requireNonNull(after);
	        return (T t) -> after.apply(apply(t));
	    }
		 */
		Function<Integer, Integer> f3 = f1.andThen(f2);
		
		System.out.println(f3.apply(10));
	}
}
