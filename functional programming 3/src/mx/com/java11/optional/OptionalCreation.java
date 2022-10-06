package mx.com.java11.optional;

import java.util.Optional;

public class OptionalCreation {

	public static void main(String[] args) {
		String A = "A string";
		Optional<String> optional = Optional.of(A);
		// Empty
		Optional<Integer> empty = Optional.empty();
		// Nullable
		Optional<String> nullable = Optional.ofNullable(A);
		Optional<String> emptyOption = Optional.ofNullable(null);
		
		
	}
}
