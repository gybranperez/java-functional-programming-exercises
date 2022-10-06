package mx.com.java8.functionalGenerics;

public class FunctionalGenericsDemo {
	public static void main(String[] args) {
		
		FunctionalGenerics<String, String> sub = s->s.substring(1,5);
		System.out.println(sub.execute("ELEFANTITO"));
		
		FunctionalGenerics<String, Integer> len = s->s.length();
		System.out.println(len.execute("ELEFANTITO"));
		
	}
}
