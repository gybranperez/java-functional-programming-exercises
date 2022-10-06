package mx.com.java8.functionalGenerics;

@FunctionalInterface
public interface FunctionalGenerics<T, R> {
	R execute(T t);
}
