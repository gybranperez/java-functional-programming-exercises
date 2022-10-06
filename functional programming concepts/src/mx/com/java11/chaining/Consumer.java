package mx.com.java11.chaining;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {
	public void accept(T t);
	
	default Consumer<T> thenAccept(Consumer<T> next) {
		// requireNonNull revisa si la LAMBDA pasada como parametro no es nulo
		Objects.requireNonNull(next);
		// devolvemos una funcion lambda que recive un parametro de tipo T
		return (T t) -> {
			this.accept(t);
			next.accept(t);
		};
	}
}
