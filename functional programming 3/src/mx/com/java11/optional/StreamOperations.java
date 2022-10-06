package mx.com.java11.optional;

import java.util.Optional;

public class StreamOperations {

	public static void main(String[] args) {
	
		Optional<String> optional = Optional.of("value");
		// stream
		optional.stream().forEach(System.out::println);
		Optional.empty().stream().forEach(System.out::println);
		
		// or
		optional
			.or(() -> Optional.of("NEW VALUE"))
			.ifPresent(System.out::println);;
		Optional.empty()
			.or(() -> Optional.of("NEW VALUE"))
			.ifPresent(System.out::println);
		
		// equals
		System.out.println(optional.equals(Optional.of("value")));

		// haskcode method
		System.out.println(optional.hashCode());
		System.out.println(Optional.empty().hashCode());
	}

}
