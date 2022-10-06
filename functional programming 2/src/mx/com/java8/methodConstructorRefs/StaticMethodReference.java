package mx.com.java8.methodConstructorRefs;

import java.util.function.BiFunction;

public class StaticMethodReference {

	public static void main(String[] args) {
		/*
		 BiFunction<T, U, R> 
		 Donde T y U son los tipos de parametro que recibe la funcion y R el tipo que devuelve
		 
		 Como se muestra en este ejemplo, tenemos una clase A_Class que contiene un metodo
		 estatico 
		 
		 cuando hacemos referencia a metodos, no necesitamos escribir 
		 los parametros de entrada del metodo estatico
		 */
		BiFunction<String, String, String> biFunction = A_Class :: staticMethod;
		System.out.println(biFunction.apply("Gybran", "Perez"));
	}

}
class A_Class{
	static String staticMethod(String a, String b) {
		return a+b;
	}
}