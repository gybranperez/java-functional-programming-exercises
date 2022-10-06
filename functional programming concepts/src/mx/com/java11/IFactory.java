package mx.com.java11;

@FunctionalInterface
public interface IFactory<T> {
	T create();
}
