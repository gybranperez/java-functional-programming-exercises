package mx.com.java11;

@FunctionalInterface
public interface IConfigurator<T,R> {
	R configure(T t);
}
