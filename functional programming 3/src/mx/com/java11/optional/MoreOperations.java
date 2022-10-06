package mx.com.java11.optional;

import java.util.Optional;

public class MoreOperations {

	public static void main(String[] args) {
	
		Optional<String> optional = Optional.of("value");
		// ifPresent
		// optional.ifPresent(System.out::println);
		optional.ifPresent(val -> System.out.println("This is a "+val));
		
		Optional.empty().ifPresent(val -> System.out.println("This is a "+val));
	
		
		// ifPresentOrElse ( si trae valor, si esta vacio )
		
		optional.ifPresentOrElse(
				System.out::println , 
				() -> System.out.println("NOT VALUE PRESENT"));
		
		Optional.empty().ifPresentOrElse(
				System.out::println , 
				() -> System.out.println("NOT VALUE PRESENT"));
	}

}
