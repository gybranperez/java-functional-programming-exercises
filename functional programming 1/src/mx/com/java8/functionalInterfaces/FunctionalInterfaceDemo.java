package mx.com.java8.functionalInterfaces;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
//		MyFunctionalInterface fun = () -> System.out.println("HOLA");
//		fun.myMethod();
		onTheFly(() -> System.out.println("HOLA"));
	}
	
	public static void onTheFly(MyFunctionalInterface fun) {
		fun.myMethod();
	}
	
}
