package mx.com.java11.optional;

import java.util.Optional;

public class Unwrap {

	public static void main(String[] args) {
		Integer val = 10;
		Optional<Integer> optional = Optional.of(val);
		// get
		System.out.println(optional.isPresent() ? optional.get() : "NADA");
		Optional<Integer> emptyOptional = Optional.empty();
		// isPresent
		System.out.println(emptyOptional.isPresent() ? emptyOptional.get() : "NADA");
		// orElse
		System.out.println(optional.orElse(0));
		// orElseGet
		System.out.println(emptyOptional.orElseGet(()->0));
		// orElseThrow
		emptyOptional.orElseThrow(()->new IllegalArgumentException());
		// orElseThrow Java10 (NoSuchElementException)
		emptyOptional.orElseThrow();
	}

}
