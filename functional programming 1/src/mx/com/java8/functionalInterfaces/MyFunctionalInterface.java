package mx.com.java8.functionalInterfaces;

// Se asegura que lo que 
// acabamos de escribir es una interfaz funcional
@FunctionalInterface
public interface MyFunctionalInterface {
	public void myMethod(); // Single abstract method
	// this is required to execute the lambda without any ambiguity
}
