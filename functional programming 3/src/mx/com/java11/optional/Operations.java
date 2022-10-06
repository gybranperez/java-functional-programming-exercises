package mx.com.java11.optional;

import java.util.Optional;

public class Operations {

	public static void main(String[] args) {
		
		Optional<String> optional = Optional.of("value");
		// map()
		String orElse = optional
				.map(val -> "Replaced")
				.orElse("Empty");
		System.out.println(orElse);
		// filter()
		Optional<String> filter = optional
				.filter(val -> val.equalsIgnoreCase("Value"));
		System.out.println(filter.get());
		// flatmap()
		Optional<String> flatmap = optional
				.flatMap(val -> Optional.of("Replaced by flatmap"));
		System.out.println(flatmap.get());
	}

}
