package mx.com.java11.currying;

import java.util.function.Function;

public class JavaCurying {

	public static void main(String[] args) {
		/* Currying
		 * Is a technique that basically restructures a multi-parameter 
		 * function, into multiple functions having single parameters each
		 * 
		 * For example
		 
		 	Function<Integer, Function<Integer, Integer>> fun1 = u -> {
				return (v) -> u+v;
			};
		 
		*/
		Function<Integer, Function<Integer, Integer>> fun1 = u -> v -> u+v;
		Function<Integer, Integer> fun2 = fun1.apply(1);
		int r = fun2.apply(2);
		System.out.println(r);
	}
 
}
