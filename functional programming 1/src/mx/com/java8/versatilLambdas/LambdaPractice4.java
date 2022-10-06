package mx.com.java8.versatilLambdas;

public class LambdaPractice4 {
	public static void main(String[] args) {
		
		LengthOfString len = s -> {
			int l = s.length();
			System.out.println("Hola " + s + " tu nombre tiene " + Integer.toString(l) + " letras.");
			return l;
		};
		System.out.println(len.length("ALE"));
		
	}
}
