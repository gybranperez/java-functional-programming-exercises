package mx.com.java11;

public class PureImpureFunction {

	private static int value = 0;
	
	public static void main(String[] args) {
		System.out.println(pureFunction(1,2));
		
		impureFunction(1);
		System.out.println(value);
		
		impureFunction(2);
		System.out.println(value);
		
		impureFunction(3);
		System.out.println(value);
		
	}
	// FUncion pura, ya que no modifica nada 
	// y devuelve un mismo tipo de valor
	public static int pureFunction(int a, int b) {
		return a+b;
	}
	// La función modifica un valor externo 
	// al alcance de la misma, por lo tanto, es impura
	public static int impureFunction(int nextValue) {
		value += nextValue;
		return value;
	}
}
