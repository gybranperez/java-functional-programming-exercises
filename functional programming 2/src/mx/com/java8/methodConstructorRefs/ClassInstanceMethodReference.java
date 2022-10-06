package mx.com.java8.methodConstructorRefs;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassInstanceMethodReference {

	public static void main(String[] args) {
		List<String> list = Stream.of("Cynthia","Elias","Susana").collect(Collectors.toList());
		// Generas la funcion Recibe String, genera Integer
		/*
		 Aqui estamos en el entendido que el parametro de entrada sera un String 
		 ya que eso nos indica la declaracion de los tipos de Function, entonces aprovechamos 
		 esta definicion de String para llamar directamente al metodo length de esa clase
		*/
		Function<String, Integer> fun = String :: length;
		// por cada elemeento de la lista le aplicamos la funcion
		List<Integer> newList = map(list, fun);
		System.out.println(newList);
		
	}

	private static <T,R> List<R> map(List<T> list, Function<T, R> fun) {
		return list.stream().map(e -> fun.apply(e)).collect(Collectors.toList());
	}

}
